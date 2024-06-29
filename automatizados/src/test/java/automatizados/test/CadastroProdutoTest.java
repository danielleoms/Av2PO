
package automatizados.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizados.pageObject.CadastroDeProdutoPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class CadastroProdutoTest extends BaseTest {

private static CadastroDeProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		driver.get("file:///C:/Users/36124872022.2N/Downloads/sistema/sistema/produtos.html");
		produtoPage = new CadastroDeProdutoPO(driver);
		produtoPage.abrirModal();
	}
	
	@AfterClass
	public static void aposTestes() {
		produtoPage.inputCodigo.clear();
		produtoPage.inputNome.clear();
		produtoPage.inputQuantidade.clear();
		produtoPage.inputValor.clear();
		produtoPage.inputData.clear();
		produtoPage.buttonEditar.clear();
		produtoPage.buttonCriar.clear();
		produtoPage.buttonSair.clear();
		produtoPage.sair();
	}
	
	@Test
    public void TC001_NaoCadastrarProdutoSemPreencherOCampoNome() {
        
        produtoPage.preencherFormulario("", "", "", "", "");
        
        String mensagemErro = produtoPage.obterMensagem();
        assertEquals("Todos os campos são obrigatórios!", mensagemErro);
    }
	
public void TC002_NaoCadastrarProdutoSemPreencherOCampoNome() {
        
        produtoPage.preencherFormulario("55", "", "15", "3000", "2024-06-28");
        
        String mensagemErro = produtoPage.obterMensagem();
        assertEquals("Todos os campos são obrigatórios!", mensagemErro);
    }
	
	@Test
	public void TC003_NãoCadastrarProdutosComQuantidadeNegativo() {
		
		produtoPage.preencherFormulario("55", "Samsung", "-10", "3000", "2024-06-28");
		
		String mensagemErro = produtoPage.obterMensagem();
        assertEquals("Campo de quantidade não pode ser menor que 0!", mensagemErro); //inseri uma mensagem de erro para este caso pois na tela, não existe este erro
        																			// e no meu entendimento um sistema de gerenciamento de armazem não deveria aceitar uma quantidade negativa de produto
        																			// pois o estoque não deve ficar em débito
	}
}


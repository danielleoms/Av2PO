package automatizados.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroDeProdutoPO extends BasePO {
    
    public CadastroDeProdutoPO(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(id = "Código")
    public WebElement inputCodigo;
    
    @FindBy(id = "Nome")
    public WebElement inputNome;
    
    @FindBy(id = "Quantidade")
    public WebElement inputQuantidade;
    
    @FindBy(id = "Valor")
    public WebElement inputValor;

    @FindBy(id = "Data")
    public WebElement inputData;
    
    @FindBy(id = "btn-adicionar")
    public WebElement buttonCriar;
    
    @FindBy(id = "btn-salvar")
    public WebElement buttonSalvar;
    
    @FindBy(id = "btn-editar")
    public WebElement buttonEditar;
    
    @FindBy(id = "btn-sair")
    public WebElement buttonSair;
    
    @FindBy(id = "mensagem")
    public WebElement spanMensagem;
    
    @FindBy(css = "body>div>div:nth-child(2)>table>tbody>tr>td:nth-child(1)")
    public WebElement tdCodigo;
    
    public void preencherFormulario(String codigo, String nome, String quantidade, String valor, String data) {
        escrever(inputCodigo, codigo);
        escrever(inputNome, nome);
        escrever(inputQuantidade, quantidade);
        escrever(inputValor, valor);
        escrever(inputData, data);
        buttonSalvar.click();
    }
    
    private void escrever(WebElement input, String texto) {
    	input.clear();
    	input.sendKeys(texto + Keys.TAB);

    	}

    	public String obterMensagem() {
    	return spanMensagem.getText();
    	}
    	
    	public void buttonCriar() {
        	buttonCriar.click();
    			
    	}
    	
    	public void buttonEditar() {
    	buttonEditar.click();
			
		}
    	
  

    	public void sair() {
    	buttonSair.click();
    	}

    	public String obterCodigoDaTabela() {
    	return tdCodigo.getText();
    	}

    	/*
    	* Método para simular a abertura do modal com um duplo clique no botao "Criar"
    	*/
    	public void abrirModal() {
    	buttonCriar.click();
    	buttonCriar.click();
    	}

		
}

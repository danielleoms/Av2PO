package automatizados.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {
	
	/**
	 * PageFactory: injeta em tempo de execução (cria dinamicamente) uma lógica de teste dentro
	 * da classe de teste que instancia GooglePO, no caso GoogleRefatorado2Test
	 * O elemento/código que cria a factory está em BasePO (PageFactory.initElements(driver, this))
	 * que é herdado por GooglePO
	 */
	@FindBy(name = "q")
	public WebElement inputPesquisa;
	
	@FindBy(id = "result-stats")
	public WebElement divResultadoPesquisa;

	@FindBy(id = "bres")
	public WebElement divPesq;
	/**
	 * Construtor para criação da página do Google
	 */
	public GooglePO(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Método que irá efetuar uma pesquisa no Google baseado no texto
	 */
	public void pesquisar(String texto) {
		inputPesquisa.sendKeys(texto + Keys.ENTER);
	}
	
	/**
	 * Método que retorna o resultado aproximado da pesquisa
	 * @return Retorna o resultado da pesquisa
	 */
	public String obterResultadoDaPesquisa() {
		//return divResultadoPesquisa.getText();
		return divPesq.getText();
	}

	
	
	
	
	
	
	
	
	
	
	
	

}

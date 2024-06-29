package automatizados.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import automatizados.pageObject.GooglePO;

public class GoogleRefatorado2Test extends BaseTest{
	
	private static GooglePO googlePage;

	@Test
	public void pesquisarNoGoogle() {
//		//Montagem do cenário já é feita quando são chamados
//		//@BeforeClass -> public static void iniciar()

		//Preparação
//		WebElement inputPesquisa = driver.findElement(By.name("q")); 

//		//Execução
//		inputPesquisa.sendKeys("receita de bolo de laranja" + Keys.ENTER);

		googlePage.inputPesquisa.sendKeys("NBA" + Keys.ENTER);
	
//		String resultado = driver.findElement(By.id("result-stats")).getText();
		String resultado = googlePage.divResultadoPesquisa.getText();
		
//		//Verificação e Análise
		assertTrue(resultado, resultado.contains("resultado"));
	}

	

	@Test
	public void pesquisarNoGoogle2() {
		googlePage.inputPesquisa.sendKeys("receita de bolo de laranja" + Keys.ENTER);
		
		String resultado = googlePage.divResultadoPesquisa.getText();
		
		//Verificação e Análise
		assertTrue(resultado, resultado.contains("resultado"));
	}
	
}	
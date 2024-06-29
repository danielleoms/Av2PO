package automatizados.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleRefatorado1Test extends BaseTest{

	@Test
	public void pesquisarNoGoogle() {
		//Montagem do cenário já é feita quando são chamados
		//@BeforeClass -> public static void iniciar()

		//Preparação
		WebElement inputPesquisa = driver.findElement(By.name("q")); 

		//Execução
		inputPesquisa.sendKeys("receita de bolo de laranja" + Keys.ENTER);

		String resultado = driver.findElement(By.id("result-stats")).getText();

		//Verificação e Análise
		assertTrue(resultado, resultado.contains("Aproximadamente"));
	}

}
package automatizados.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import automatizados.pageObject.LoginPO;

public class LoginTest extends BaseTest{
	
	private static LoginPO loginPage;
	
	@BeforeClass
	public static void prepararTestes() {
		loginPage = new LoginPO(driver);
	}

	@Test
	public void TC001_naodeveLogarNoSistemaComEmailESenhaVazios() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
		
		//melhoria 1
		//loginPage.escrever(loginPage.inputEmail,"");
		//loginPage.escrever(loginPage.inputSenha,"");
		
		//melhoria 2
		//loginPage.buttonEntrar.click();
		loginPage.executarAcaoDeLogar("","");
		
		//melhoria 3
		//String mensagem = loginPage.spanMensagem.getText();
		String mensagem = loginPage.obterMensagem();
		
		assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
	}
	
}


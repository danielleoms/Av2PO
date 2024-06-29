package automatizados.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para a criação das novas PageObjects
 * Todas as pages devem herdar esta classe
 * @author 36124872022.2N
 */

public class BasePO {
	
	/**Driver base que será usado pelas pages*/
	protected WebDriver driver;
	
	/**
	 * Construtor base para a criação da fábrica de elementos (PageFactory)
	 * @param driver (Driver do navegador atual)
	 */
	public BasePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
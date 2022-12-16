package paginas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paginainicio {
	
	//elementos
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement linkSingIn;
	
		
	@FindBy(id="search_query_top")
	WebElement txtBuscador;
	
	//consturctor

	public Paginainicio(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	//acciones
	
	public void hacerClickenSingIn() {
		linkSingIn.click();
		}
	
	public void escribirValorAbuscar(String palabra) {
		txtBuscador.sendKeys(palabra);
		
	}
	
	public void presionarEnterBuscadro() {
		
		txtBuscador.sendKeys(Keys.ENTER);
		
		
	}
	

}

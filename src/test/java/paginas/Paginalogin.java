package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paginalogin {
	
	//elementos
	
	
	@FindBy(id="email")
	WebElement txtEmail;
	

	@FindBy(css="#passwd")
	WebElement txtpass;
	

	@FindBy(name="SubmitLogin")
	WebElement btnSingIn;
	
	
	@FindBy(linkText="Sign out")
	WebElement btnSignOut;
	
	//constructor
	
	public Paginalogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//acciones
	
	public void escribirEmail(String email) {
	txtEmail.sendKeys(email);
	}
	
	public void escribirPass(String pass) {
		
		txtpass.sendKeys(pass);
		
	}
	
	
	public void haceClickSingin() {
		
		btnSingIn.click();
		
	}
	
	
	//es necesario para que se ejecute el testing completo
	
	public void hacerClickSignOut() {
		
		
		btnSignOut.click();
		
	}
	
	
}

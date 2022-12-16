package edit.CeducacionIT15112022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.Paginainicio;
import paginas.Paginalogin;

public class laboratorio8 {
	
	String Url="http://automationpractice.pl/index.php";
	String chromePath="..\\CeducacionIT15112022\\Drivers\\chromedriver107.0.5304.62.exe";
	WebDriver driver;

	
	@BeforeSuite
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void login() {
		//en la pagina principal hacel click en el sign in
		
		Paginainicio inicio =new Paginainicio(driver);
		
		inicio.hacerClickenSingIn();
		
		//ingresar el correo
		
		Paginalogin login = new Paginalogin(driver);
		
		login.escribirEmail("micorreo0.49371667298070876@test.com");
		
		//ingresar la contraseña
		
		
		login.escribirPass("test1234");
		
		// click en el boton 
		
		login.haceClickSingin();
		
	}
	
	
	
	@Test
	public void buscarPalabra() {
		Paginainicio inicio = new Paginainicio(driver);
		inicio.escribirValorAbuscar("dress");
		inicio.presionarEnterBuscadro();		
		
	}
	
	
	
	
	
}

	
	
	
	


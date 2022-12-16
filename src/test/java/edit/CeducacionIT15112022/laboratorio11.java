package edit.CeducacionIT15112022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.DatosExcel;
import paginas.Paginainicio;
import paginas.Paginalogin;

public class laboratorio11 {
	
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
	
	
	@Test (dataProvider="datos login desde excel")
	public void login(String email, String pass) {
		//en la pagina principal hacel click en el sign in
		
		Paginainicio inicio =new Paginainicio(driver);
		
		inicio.hacerClickenSingIn();
		
		//ingresar el correo
		
		Paginalogin login = new Paginalogin(driver);
		
		login.escribirEmail(email);
		
		//login.escribirEmail("micorreo0.49371667298070876@test.com");
		
		//ingresar la contraseña
		
		login.escribirPass(pass);
		//login.escribirPass("test1234");
		
		// click en el boton 
		
		login.haceClickSingin();
		
		
		
		Assert.assertEquals("http://automationpractice.pl/index.php?controller=my-account", driver.getCurrentUrl());
		
		
		login.hacerClickSignOut();
		
		
	}
	
	
	@DataProvider(name="datos login desde excel")
	public Object [][] obtenerDatosExcel() throws Exception{
		
		return DatosExcel.leerExcel("..\\CeducacionIT15112022\\Datos\\datos_Login.xlsx", "Hoja1");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

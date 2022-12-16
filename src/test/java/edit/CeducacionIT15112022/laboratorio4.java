package edit.CeducacionIT15112022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class laboratorio4 {
	
	//atributos : variables de uso general
		String url ="http://automationpractice.pl/index.php";
		String chromePath="..\\CeducacionIT15112022\\Drivers\\chromedriver107.0.5304.62.exe";
		WebDriver driver;
	
	@BeforeSuite
	//son todas las acciones que se van a ejecutar antes de toda la suite de pruebas
	public void beforeSuite() {
		System.out.println("beforeSuite -  inicio de la clase java");
		
	}
	@BeforeTest
	//acciones que sevan a ejecutar antes de los @Test - parametros	
	
	public void beforeTest() {
		System.out.println("beforeTest -  inicio de @test");
		
	}
	@BeforeClass
	//acciones que se van a aejecutar antes de cualquier @test de este archivo
	public void beforeClass() {
		System.out.println("beforeClass -  inicio de testing");
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.get(url);
		
		
	}
	
	
	
	@Test
	public void BuscarPalabra() {
		
		WebElement txtbuscador = driver.findElement(By.id("search_query_top"));
							
		txtbuscador.sendKeys("dress");
						
		txtbuscador.sendKeys(Keys.ENTER);
		
			
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("afterClass -  fin del test");
		
		
		
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("afterTest -  fin del @TEST");
		
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("afterSuite -  fin de la suite ");
		driver.close();
		
	}
	
	
	
	

}

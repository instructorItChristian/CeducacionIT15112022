package edit.CeducacionIT15112022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class laboratorio5 {
	
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



@Test(description="Cp001 - buscar palabra en AutomationPractice", priority=20)
public void BuscarPalabra() {
	
	WebElement txtbuscador = driver.findElement(By.id("search_query_top"));
						
	txtbuscador.sendKeys("dress");
					
	txtbuscador.sendKeys(Keys.ENTER);
	
	
	//validaciones
	
	Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.pl/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
	Assert.assertEquals(driver.getTitle(), "Search - My Store");
		
}

@Test (description="Cp002 - ir a Contact US", priority=10)
public void IrAContacUs() {
	
	driver.findElement(By.linkText("Contact us")).click();
	
	
	Select subject = new Select(driver.findElement(By.id("id_contact")));
	
	subject.selectByValue("2");
	
	driver.findElement(By.cssSelector("#email")).sendKeys("correo@test.com");
	
	driver.findElement(By.xpath("//input[@id='id_order']")).sendKeys("123456");
	
	driver.findElement(By.id("fileUpload")).sendKeys("C:\\testenvio.txt");
	
	driver.findElement(By.cssSelector("#message")).sendKeys("msj de prueba");
	
	driver.findElement(By.xpath("//button[@id='submitMessage']")).click();
	
	
	
	
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
	//driver.close();
	
}




	
	

}

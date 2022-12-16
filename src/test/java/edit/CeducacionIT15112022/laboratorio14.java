package edit.CeducacionIT15112022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class laboratorio14 {
	
	String Url="http://www.selenium.dev";

	WebDriver driver;

	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Url);
	
		
	}
	
	
	@Test
	public void pruebaBoniGarcia() {
	System.out.println("prueba sin el driver Chrome");
		
	}
	
	

	
	
	
}

	
	
	
	


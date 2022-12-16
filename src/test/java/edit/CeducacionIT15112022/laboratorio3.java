package edit.CeducacionIT15112022;


import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class laboratorio3 {
	
	String Url ="http://automationpractice.pl/index.php?controller=authentication&back=my-account";
	String driverPath="..\\CeducacionIT15112022\\Drivers\\chromedriver107.0.5304.62.exe";
	WebDriver driver;
	
	@Test
	public void registrarUsuario() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "incognito"); 
				
		/*
		 * incognito
		 * disable-extensions
		 * disable-popup-blocking
		 * start-maximizied 
		 * 		 * 
		 */
		
		driver = new ChromeDriver(options);
		
		driver.navigate().to(Url);
		
		//ingreso de correo electronico
		
		driver.findElement(By.id("email_create")).sendKeys("micorreo" + Math.random() +"@test.com");
		
		driver.findElement(By.cssSelector("#SubmitCreate")).click();
		
		
		//carga de formularios
		//seleccion del radio button
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("pepe");
		
		
		driver.findElement(By.name("customer_lastname")).sendKeys("Argento");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("@@");
		
		
		Select days = new Select(driver.findElement(By.name("days"))); 
		days.selectByVisibleText("24  ");
		
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("11");
		
		Select year = new Select(driver.findElement(By.cssSelector("#years")));
		year.selectByIndex(1);
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		
		//boton de register
		
		driver.findElement(By.name("submitAccount")).click();
		
		
		
	}
	
	
	
	
	
	

}

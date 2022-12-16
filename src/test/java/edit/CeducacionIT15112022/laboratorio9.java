package edit.CeducacionIT15112022;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class laboratorio9 {
	
	String Url="https://demoqa.com/alerts";
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
	public void alerta1() {
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alerta = driver.switchTo().alert();
		
		alerta.accept();
		
		
	}
	
	
	
	
	@Test
	public void alerta2() {
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alerta =driver.switchTo().alert();
		alerta.accept();
		
		
	}
	
	
	@Test
	public void alerta3() {
		
		driver.findElement(By.id("confirmButton")).click();
				
		Alert alerta=driver.switchTo().alert();
		alerta.dismiss();
		
		
	}
	
	@Test
	public void alerta4() {
		
		driver.findElement(By.id("promtButton")).click();
				
		Alert alerta=driver.switchTo().alert();
		alerta.sendKeys("clase de automatizacion");
		alerta.accept();
		
		
	}
	
	
	

}

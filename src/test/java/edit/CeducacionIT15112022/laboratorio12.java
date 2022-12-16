package edit.CeducacionIT15112022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;



public class laboratorio12 {
	
	String Url="https://demo.guru99.com/test/table.html";
//	String url2 ="https://www.demo.guru99.com/test/table.html";
	
	
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
	public void imprimirValoresTabla() {
		
String valor1 = driver.findElement(By.xpath("//html/body/table/tbody/tr[1]/td[2]")).getText();
		
			
	//String valor1 =driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		
		System.out.println("primera fila, segunda columna : " + valor1);
	
		String valor2 = driver.findElement(By.xpath("//html/body/table/tbody/tr[3]/td[1]")).getText();	
		
		System.out.println("tercera fila, primer columna : " + valor2);
		
		String valor3 = driver.findElement(By.xpath("//html/body/table/tbody/tr[5]/td[1]")).getText();	
		
		System.out.println("quinta fila, primer columna : " + valor3);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

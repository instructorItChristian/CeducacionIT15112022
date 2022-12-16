package edit.CeducacionIT15112022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class laboratorio7 {
	

	
	//atributos : variables de uso general
	String url ="http://automationpractice.pl/index.php";
	String chromePath="..\\CeducacionIT15112022\\Drivers\\chromedriver107.0.5304.62.exe";
	String firefoxPath ="..\\CeducacionIT15112022\\Drivers\\geckodriver0.32.0.64.exe";
	WebDriver driver;
	
	
	@Parameters("navegador")
	
	@BeforeTest
	public void setup(String navegador) {
		
		
		if(navegador.equalsIgnoreCase("chrome")) {
		//paso1 : donde esta el driver
		
				System.setProperty("webdriver.chrome.driver", chromePath);
			
			//paso2 : abril al pagina que queremos automatizar
				
				driver = new ChromeDriver();
				driver.get(url);
		}else if(navegador.equalsIgnoreCase("firefox")) {
				
				
				
				//paso1 : donde esta el driver
				
				System.setProperty("webdriver.firefox.driver", firefoxPath);
				
			
			//paso2 : abril al pagina que queremos automatizar
				
				driver = new FirefoxDriver();
				driver.get(url);
				
		}
		
		
	}
	
	
	
	
	//metodos : rutinas para automatizar chrome y firefox
	
	@Test
	public void BuscarPalabra() {
		
	//paso3: escribir la palabra a buscar
		
		WebElement txtbuscador = driver.findElement(By.id("search_query_top"));
	
	//paso4 : hacer la busqueda
		
			//4.1 escribir la palabra
		
				txtbuscador.sendKeys("dress");
		
			//4.2 hacer enter
				
				txtbuscador.sendKeys(Keys.ENTER);
	
	//paso5 (opcional) : cerrar el navegado
	
	
	
	
	}
	

	
	
	
	

}

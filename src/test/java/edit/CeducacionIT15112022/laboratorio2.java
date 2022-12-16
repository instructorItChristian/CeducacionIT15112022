package edit.CeducacionIT15112022;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class laboratorio2 {
	
	
	//atributos : variables de uso general
	String url ="http://automationpractice.pl/index.php";
	String chromePath="..\\CeducacionIT15112022\\Drivers\\chromedriver107.0.5304.62.exe";
	String firefoxPath ="..\\CeducacionIT15112022\\Drivers\\geckodriver0.32.0.64.exe";
	WebDriver driver;
	
	
	//metodos : rutinas para automatizar chrome y firefox
	
	@Test
	public void BuscarPalabraChrome() {
	
	//paso1 : donde esta el driver
		
		System.setProperty("webdriver.chrome.driver", chromePath);
	
	//paso2 : abril al pagina que queremos automatizar
		
		driver = new ChromeDriver();
		driver.get(url);
		
	
	//paso3: escribir la palabra a buscar
		
		WebElement txtbuscador = driver.findElement(By.id("search_query_top"));
	
	//paso4 : hacer la busqueda
		
			//4.1 escribir la palabra
		
				txtbuscador.sendKeys("dress");
		
			//4.2 hacer enter
				
				txtbuscador.sendKeys(Keys.ENTER);
	
	//paso5 (opcional) : cerrar el navegado
	
	
	
	
	}
	
	@Test
	public void BuscarPalabraFirefox() {
	
	//paso1 : donde esta el driver
		
		System.setProperty("webdriver.firefox.driver", firefoxPath);
		//System.setProperty("webdriver.firefox.bin", "c:\\Program Files\\Mozilla Firefox\\firefox.exe");
	
	//paso2 : abril al pagina que queremos automatizar
		
		driver = new FirefoxDriver();
		driver.get(url);
		
	
	//paso3: escribir la palabra a buscar
		
		WebElement txtbuscador = driver.findElement(By.id("search_query_top"));
	
	//paso4 : hacer la busqueda
		
			//4.1 escribir la palabra
		
				txtbuscador.sendKeys("dress");
		
			//4.2 hacer enter
				
				txtbuscador.sendKeys(Keys.ENTER);
	
	//paso5 (opcional) : cerrar el navegado
	
	
	
	
	}
	
	
	
	@Test
	public void BuscarPalabraChromeBeta() {
	
	//paso1 : donde esta el driver
		
		System.setProperty("webdriver.chrome.driver", chromePath);
	
		//generacion variable de opciones de configuracion
	ChromeOptions options = new ChromeOptions();
	//definicion de ubicacion de binario
	options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		
		//paso2 : abril al pagina que queremos automatizar
		
		
		
		driver = new ChromeDriver(options);
		driver.navigate().to(url);//=driver.get(url);

	//espera
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

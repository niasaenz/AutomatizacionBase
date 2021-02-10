package app.helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import app.pageObjects.LoginPage;
import app.test.ClasePrincipal;

public class InicioSistema extends ClasePrincipal{
	
	LoginPage login = new LoginPage();
	
	WebDriver driver = null;
	
	public InicioSistema (){
		String browser = "chrome";
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\\\geckodriver.exe");
		
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}						
	}
	
	public void Abrirfacebook(){
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.get("https://es-la.facebook.com/");
				driver.manage().window().maximize();
				login.completarLogin(driver);
				inicioP.alerta(driver);
				inicioP.buscarPaginaFacebook(driver);
	}
	
	public void CerrarNavegador(){
		driver.close();
	}
	

}

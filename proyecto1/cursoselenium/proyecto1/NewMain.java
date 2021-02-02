package proyecto1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
		//comentario
>>>>>>> Rama_Prueba
=======
		//comentario
>>>>>>> Rama_Prueba
=======
		//comentario
>>>>>>> Rama_Prueba
		String browser = "chrome";
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\\\geckodriver.exe");
		
		
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		
		//TimeOut
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://es-la.facebook.com/");
		driver.manage().window().maximize();
	}

}

package proyecto1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//comentario
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> Rama_Prueba
		//2 comentario
=======
>>>>>>> 51017e8b1a5f816888f84287994088e9e364d44d
=======
>>>>>>> 164fef6ab03228d000b1d480793769c46e543c4a
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
		//
	}

}

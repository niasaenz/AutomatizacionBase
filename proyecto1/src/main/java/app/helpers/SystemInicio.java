package app.helpers;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SystemInicio {
	

    public static enum Drivers {
        CHROME, FIREFOX
    }

    public static WebDriver iniciarNavegador(Drivers browser, String sitio, String mode) {
        WebDriver driver;
        switch (browser) {
        case CHROME:
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            System.out.println(mode);
            if("headless".equals(mode)){
                options.addArguments("--start-maximized");
                options.addArguments("--enable-automation");
                options.addArguments("--headless");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-browser-side-navigation");
                options.addArguments("--disable-gpu");
            }
            driver = new ChromeDriver(options);
            System.out.println("driver"+driver);
            cambiarPestania(driver, sitio);
            break;
        case FIREFOX:
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setJavascriptEnabled(true);
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            cambiarPestania(driver, sitio);
            break;
        default:
            driver = null;
        }
        return driver;
    }
    
    private static void cambiarPestania(WebDriver driver, String sitio) {
        driver.get(sitio);
        for (String currentWindow : driver.getWindowHandles()) {
            driver.switchTo().window(currentWindow);
        }
        driver.manage().window().maximize();
    }

}

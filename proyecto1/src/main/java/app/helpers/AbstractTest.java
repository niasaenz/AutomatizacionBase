package app.helpers;

import org.openqa.selenium.WebDriver;

public abstract class AbstractTest{
	
	protected static WebDriver driver;	
	protected static Accion accion;
	    
	    public void setDriver(WebDriver nuevoDriver) {
	        driver = nuevoDriver;
	        accion = new Accion(driver);
	    }
	

}

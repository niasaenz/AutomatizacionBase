package app.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import app.helpers.Accion;
import app.helpers.Waiter;

public class LoginPage {

	public void completarLogin(WebDriver driver) {
		WebElement email = driver.findElement(By.id("email"));  
		email.sendKeys("nia-saenz@hotmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("storyofmylife");
		WebElement iniciarSesion = driver.findElement(By.name("login"));
		iniciarSesion.click();
  
	}
	

}

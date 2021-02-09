package app.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import app.helpers.Accion;

public class InicioPage {
	
	Accion accion;
	

	private WebDriver driver;
	
	
	public void buscarPaginaFacebook(WebDriver driver){
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.click();
		search.sendKeys("Alejandra Perez");
		search.sendKeys(Keys.ENTER);
		accion = new Accion(driver);
		WebElement persona = driver.findElement(By.xpath("(//a[@aria-label='Alejandra Perez'])[1]"));
		accion.doubleClick(persona);
		System.out.println("se dio doble click bien");
		
		
	}
	
	public void alerta(WebDriver driver){
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}

}

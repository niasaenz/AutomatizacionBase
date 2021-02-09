package app.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Accion extends Actions{
	
	
    public Accion(WebDriver driver) {
		super(driver);
	}

	public void llenarCampo(WebElement elemento, String valor) {
    	enviarTexto(elemento, valor);
    	// Segundo intento (Hay ocaciones en las que no carga el texto completo):
    	enviarTexto(elemento, valor);
    }
    
    public void limpiarCampo(WebElement elemento) {
        elemento.clear();
  }
    
    private void enviarTexto(WebElement elemento, String valor) {
    	if (!valor.contentEquals(getValor(elemento))) {
            limpiarCampo(elemento);
            sendKeys(elemento, valor).perform();
        }
    }
    
    private Actions sendKeys(WebElement elemento, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getValor(WebElement elemento) {
        try {
            return elemento.getAttribute("value");
        } catch (NullPointerException e) {
            return "";
        }
    }
	
    public void dobleClick() {
        doubleClick().perform();
    }

    public void dobleClick(WebElement elemento) {
        doubleClick(elemento).perform();
    }


}

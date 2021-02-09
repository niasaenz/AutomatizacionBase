package app.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import app.helpers.InicioSistema;

public class Tests {
	
	InicioSistema inicio;


	@Before
	public void AbrirNavegador(){
		inicio = new InicioSistema();	
	}
	
	@Test
		public void  AbrirFb() {
		inicio.Abrirfacebook();	
	}
	
	@After
		public void CerrarNavegador(){
		inicio.CerrarNavegador();
		inicio = null;
	}


}

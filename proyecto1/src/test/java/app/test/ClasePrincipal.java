package app.test;

import app.pageObjects.InicioPage;
import app.pageObjects.LoginPage;

public class ClasePrincipal {
	protected LoginPage login;
	protected InicioPage inicioP;
	

	public ClasePrincipal() {
		this.login = new LoginPage();
		this.inicioP = new InicioPage();
	}
	
	

}

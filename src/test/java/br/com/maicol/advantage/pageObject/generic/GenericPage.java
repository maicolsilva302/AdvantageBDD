package br.com.maicol.advantage.pageObject.generic;

import org.openqa.selenium.By;

public class GenericPage {
	
	private By btnUser = By.xpath("//*[@id='menuUser']");
	private By btnUserLogout = By.xpath("//*[@id='menuUserSVGPath']");
	private By btnSignOut = By.xpath("//*[@id='loginMiniTitle']/label[3]");
	private By msgValida = By.xpath("(//*[contains(text(),'ts08')])[2]");

	public By getBtnUser() {
		return btnUser;
	}
	public By getBtnUserLogout() {
		return btnUserLogout;
	}

	public By getMsgValida() {
		return msgValida;
	}
	
	public By getSignOut() {
		return btnSignOut;
	}

}

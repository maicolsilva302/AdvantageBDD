package br.com.advantage.page.generic;

import org.openqa.selenium.By;

public class GenericPage {
	
	private By btnUser = By.xpath("//*[@id='menuUser']");
	private By msgValida = By.xpath("(//*[contains(text(),'ts08')])[2]");

	public By getBtnUser() {
		return btnUser;
	}

	public By getMsgValida() {
		return msgValida;
	}

}

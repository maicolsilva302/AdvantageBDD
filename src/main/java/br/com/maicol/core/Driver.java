package br.com.maicol.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public static WebDriver abreNavegador() {
		if (driver == null) {
			driver = new ChromeDriver();
			wait = new WebDriverWait(Driver.abreNavegador(), 40);
			driver.manage().window().maximize();
		}
		return driver;

	}

	public void navega(String url) {
		Driver.abreNavegador().get(url);
	}

	public static void fechaNavegador() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}

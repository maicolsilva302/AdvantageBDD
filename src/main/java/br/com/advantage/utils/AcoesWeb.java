package br.com.advantage.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.com.advantage.core.Driver;

public class AcoesWeb extends Driver {
	
	public static void clicar(By elemento) {
		acharElemento(elemento).click();
	}

	public static WebElement acharElemento(By elemento) {
		return driver.findElement(elemento);
	}

	public void esperarAteOElementoEstarClicavel(By elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public static void espera(int iTimeInMillis) {
		try {
			Thread.sleep(iTimeInMillis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static void limpaEInsereTexto(String texto, By campo) {
		if (acharElemento(campo).isDisplayed()) {
			acharElemento(campo).clear();
			espera(500);
			acharElemento(campo).sendKeys(texto);
		}
	}

	public static void selecionarComboPorTextoVisivel(By by, String visibleText) {
		WebElement element = acharElemento(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(visibleText);
	}

	public Object executeJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(cmd, param);
	}

	public void click(By by) {
		WebElement element = acharElemento(by);
		executeJS("javascript:void(0)", element);
		element.click();
	}

	public void esperarPresencaDoElementoDesejado(By elemento) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elemento));
	}

	public static boolean elementoVisivel(By elemento) {
		return driver.findElement(elemento).isDisplayed();
	}

	public void screenShot(String status, String nomeTeste) {
		try {
			TakesScreenshot fonte = (TakesScreenshot) Driver.abreNavegador();
			File fnt = fonte.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fnt,
					new File("Evidencias" + File.separator + status + File.separator + nomeTeste + ".jpg"));
		} catch (Exception e) {
			System.out.println("Erro na Escrita de arquivo.");
		}
	}
}

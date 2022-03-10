package br.com.maicol.advantage.pageObject.consulta;

import org.openqa.selenium.By;

public class ConsultaPage {
	
	private By btnPesquisarProdutos = By.id("menuSearch");
	private By cmpDigitaProduto = By.id("autoComplete");
	private By msgValida = By.xpath("//*[contains(text(),'Search result')]");
	
	public By getPesquisarProduto() {
		return btnPesquisarProdutos;
	}
	
	public By getDigitarProduto() {
		return cmpDigitaProduto;
	}

	public By getMsgValida() {
		return msgValida;
	}

}

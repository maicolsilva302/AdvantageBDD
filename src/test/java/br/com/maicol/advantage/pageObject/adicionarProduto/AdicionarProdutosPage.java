package br.com.maicol.advantage.pageObject.adicionarProduto;

import org.openqa.selenium.By;

public class AdicionarProdutosPage {

	private By clickProduto = By.xpath("//*[contains(text(),'TABLETS')]");
	private By btnAdicionarAoCarrinho = By.xpath("//button[@name='save_to_cart']");
	private By primeiroElemento = By.xpath("//a[@href='#/product/16']");
	private By btnCart = By.id("menuCart");
	
	public By getClicaProduto() {
		return clickProduto;
	}

	public By getAdicionarAoCarrinho() {
		return btnAdicionarAoCarrinho;
	}

	public By getPrimeiroElemento() {
		return primeiroElemento;
	}
	
	public By getCart() {
		return btnCart;
	}
}

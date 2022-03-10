package br.com.maicol.advantage.pageObject.adicionarProduto;

import br.com.maicol.util.AcoesWeb;

public class AdicionarProdutosLogic extends AcoesWeb {

	private AdicionarProdutosPage adicionarProdutosPage;

	public AdicionarProdutosLogic() {
		adicionarProdutosPage = new AdicionarProdutosPage();
	}

	public void clicoNoProduto(String produto) {
		esperarAteOElementoEstarClicavel(adicionarProdutosPage.getClicaProduto());
		click(adicionarProdutosPage.getClicaProduto());
	}

	public void clicoNaPrimeiraOpcaoDaLista() {
		esperarAteOElementoEstarClicavel(adicionarProdutosPage.getPrimeiroElemento());
		click(adicionarProdutosPage.getPrimeiroElemento());
	}

	public void AdicionarItemAoCarrinho() {
		esperarAteOElementoEstarClicavel(adicionarProdutosPage.getAdicionarAoCarrinho());
		espera(2000);
		click(adicionarProdutosPage.getAdicionarAoCarrinho());
	}

	public void clicarCarrinho() {
		espera(5000);
		esperarAteOElementoEstarClicavel(adicionarProdutosPage.getCart());
		click(adicionarProdutosPage.getCart());
	}
	

}

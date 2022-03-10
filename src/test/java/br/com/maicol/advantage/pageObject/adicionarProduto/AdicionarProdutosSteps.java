package br.com.maicol.advantage.pageObject.adicionarProduto;

import cucumber.api.java.en.Given;

public class AdicionarProdutosSteps {

	private AdicionarProdutosLogic adicionarProdutosLogic;

	public AdicionarProdutosSteps() {
		adicionarProdutosLogic = new AdicionarProdutosLogic();
	}

	@Given("^clico no produto \"([^\"]*)\"$")
	public void clico_no_produto(String produto) {
		adicionarProdutosLogic.clicoNoProduto(produto);
	}

	@Given("^clico na primeira opcao da lista$")
	public void clico_na_primeira_opcao_da_lista() {
		adicionarProdutosLogic.clicoNaPrimeiraOpcaoDaLista();
	}

	@Given("^clico em adicionar item ao carrinho$")
	public void clico_em_adicionar_item_ao_carrinho() {
		adicionarProdutosLogic.AdicionarItemAoCarrinho();
	}

	@Given("^clico em meu carrinho$")
	public void clico_em_meu_carrinho() {
		adicionarProdutosLogic.clicarCarrinho();
	}
}

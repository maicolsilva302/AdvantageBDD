package br.com.maicol.advantage.pageObject.consulta;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ConsultaSteps {
	
	private ConsultaLogic consultaLogic;
	
	public ConsultaSteps() {
		consultaLogic = new ConsultaLogic();	
	}
	
	@Given("^Clico em pesquisar produtos$")
	public void clico_Em_Pesquisar_Produtos() {
		consultaLogic.clicaPesquisarProdutos();
	}
	
	@Given("^Digito o produto \"([^\"]*)\"$")
	public void digitoOProduto(String produto) {
		consultaLogic.digitarProduto(produto);
	}
	
	@Then("^valido a mensagem final$")
	public void validoAMensagemFinal() {
		consultaLogic.validarMensagemFinal();
	}


}

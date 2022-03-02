package br.com.advantage.page.generic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenericStep {
	
	private GenericLogic generic;

	public GenericStep() {
		generic = new GenericLogic();
	}

	@Given("^Navego para a pagina inical do site Advantage$")
	public void navegoParaAPaginaInicalDoSiteAdvantage() {
		generic.navegar();
	}

	@Given("^seleciono usuario$")
	public void seleciono_usuario() {
		generic.clicarUser();
	}

	@Then("^valido cadastro realizado com sucesso$")
	public void validoCadastroRealizadoComSucesso() {
		generic.validarMensagemFinal();
	}

}

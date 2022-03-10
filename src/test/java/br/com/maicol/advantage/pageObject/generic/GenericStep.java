package br.com.maicol.advantage.pageObject.generic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenericStep {
	
	private GenericLogic generic;

	public GenericStep() {
		generic = new GenericLogic();
	}

	@Given("^Navego para a pagina inical do site Advantage$")
	public void navego_para_pagina_inical_do_site_advantage() {
		generic.navegar();
	}

	@Given("^seleciono usuario$")
	public void seleciono_usuario() {
		generic.clicarUser();
	}
	
	@Given("^seleciono usuario para realizar logout$")
	public void seleciono_usuario_para_realizar_logout() {
		generic.clicarUserLogout();
	}

	@Then("^valido cadastro realizado com sucesso$")
	public void valido_cadastro_realizado_com_sucesso() {
		generic.validarMensagemFinal();
	}
	
	@Given("^clico em sign out$")
	public void clico_em_sign_out() {
		generic.clicarSignOut();
	}

}

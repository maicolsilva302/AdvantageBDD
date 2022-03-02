package br.com.advantage.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStep {
	
	private LoginLogic login;

	public LoginStep() {
		login = new LoginLogic();
	}

	@Given("^digito meu usuario \"([^\"]*)\"$")
	public void digito_meu_usuario(String uruario) {
		login.preencherUsuario(uruario);
	}

	@Given("^digito minha senha \"([^\"]*)\"$")
	public void digito_minha_senha(String senha) {
		login.preencherSenha(senha);
	}

	@When("^clico em logar$")
	public void clico_em_logar() {
		login.clicarLogar();
	}

}

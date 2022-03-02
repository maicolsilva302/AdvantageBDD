package br.com.advantage.page.cadastro;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CadastroStep {
	
	private CadastroLogic cadastroLogic;

	public CadastroStep() {
		cadastroLogic = new CadastroLogic();
	}

	@Given("^clico em criar nova conta$")
	public void clicoEmCriarNovaConta() {
		cadastroLogic.clicarCriarConta();
	}

	@Given("^digito username \"([^\"]*)\"$")
	public void digitoUsername(String userName) {
		cadastroLogic.digitarUserName(userName);
	}

	@Given("^digito email valido \"([^\"]*)\"$")
	public void digitoEmailValido(String email) {
		cadastroLogic.digitarEmail(email);
	}

	@Given("^digito senha \"([^\"]*)\"$")
	public void digitoSenha(String senha) {
		cadastroLogic.digitarSenha(senha);
	}

	@Given("^confirmo senha \"([^\"]*)\"$")
	public void confirmoSenha(String confirmoSenha) {
		cadastroLogic.confirmarSenha(confirmoSenha);
	}

	@Given("^digito nome \"([^\"]*)\"$")
	public void digitoNome(String nome) {
		cadastroLogic.digitarNome(nome);
	}

	@Given("^digito sobre nome \"([^\"]*)\"$")
	public void digitoSobreNome(String sobreNome) {
		cadastroLogic.digitarSobreNome(sobreNome);

	}

	@Given("^digito numero de telefone \"([^\"]*)\"$")
	public void digitoNumeroDeTelefone(String numeroTel) {
		cadastroLogic.digitarTelefone(numeroTel);

	}

	@Given("^seleciono pais \"([^\"]*)\"$")
	public void selecionoPais(String pais) {
		cadastroLogic.selecionarPais(pais);
	}

	@Given("^digito cidade \"([^\"]*)\"$")
	public void digitoCidade(String cidade) {
		cadastroLogic.digitarCidade(cidade);
	}

	@Given("^digito endereco \"([^\"]*)\"$")
	public void digitoEndereco(String endereco) {
		cadastroLogic.digitarEndereco(endereco);
	}

	@Given("^digito estado \"([^\"]*)\"$")
	public void digitoEstado(String estado) {
		cadastroLogic.digitarEstado(estado);

	}

	@Given("^digito codigo postal \"([^\"]*)\"$")
	public void digitoCodigoPostal(String codigoPostal) {
		cadastroLogic.digitarCodigoPostal(codigoPostal);
	}

	@Given("^seleciono aceitar condicoes$")
	public void selecionoAceitarCondicoes() {
		cadastroLogic.selecionaAceitarCondicoes();
	}

	@When("^clico em registrar$")
	public void clicoEmRegistrar() {
		cadastroLogic.clicarRegistrar();
	}

}

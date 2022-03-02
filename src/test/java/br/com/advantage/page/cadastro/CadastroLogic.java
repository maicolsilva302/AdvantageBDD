package br.com.advantage.page.cadastro;

import br.com.advantage.utils.AcoesWeb;

public class CadastroLogic extends AcoesWeb {
	
	private CadastroPage cadastroPage;

	public CadastroLogic() {
		cadastroPage = new CadastroPage();
	}

	public void clicarCriarConta() {
		esperarAteOElementoEstarClicavel(cadastroPage.getBtnCriarConta());
		clicar(cadastroPage.getBtnCriarConta());
	}

	public void digitarUserName(String userName) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpUserName());
		limpaEInsereTexto(userName, cadastroPage.getCmpUserName());
	}

	public void digitarEmail(String email) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpEmail());
		limpaEInsereTexto(email, cadastroPage.getCmpEmail());
	}

	public void digitarSenha(String senha) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpPassWord());
		limpaEInsereTexto(senha, cadastroPage.getCmpPassWord());
	}

	public void confirmarSenha(String confirmoSenha) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpConfirmPassWord());
		limpaEInsereTexto(confirmoSenha, cadastroPage.getCmpConfirmPassWord());
	}

	public void digitarNome(String nome) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpFirstName());
		limpaEInsereTexto(nome, cadastroPage.getCmpFirstName());
	}

	public void digitarSobreNome(String sobreNome) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpLastName());
		limpaEInsereTexto(sobreNome, cadastroPage.getCmpLastName());
	}

	public void digitarTelefone(String numeroTel) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpPhoneNumber());
		limpaEInsereTexto(numeroTel, cadastroPage.getCmpPhoneNumber());
	}

	public void selecionarPais(String pais) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpContry());
		selecionarComboPorTextoVisivel(cadastroPage.getCmpContry(), pais);
	}

	public void digitarCidade(String cidade) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpCity());
		limpaEInsereTexto(cidade, cadastroPage.getCmpCity());
	}

	public void digitarEndereco(String endereco) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpAdress());
		limpaEInsereTexto(endereco, cadastroPage.getCmpAdress());
	}

	public void digitarEstado(String estado) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpState());
		limpaEInsereTexto(estado, cadastroPage.getCmpState());
	}

	public void digitarCodigoPostal(String codigoPostal) {
		esperarAteOElementoEstarClicavel(cadastroPage.getCmpPostalCode());
		limpaEInsereTexto(codigoPostal, cadastroPage.getCmpPostalCode());
	}

	public void selecionaAceitarCondicoes() {
		esperarAteOElementoEstarClicavel(cadastroPage.getBxAgree());
		clicar(cadastroPage.getBxAgree());
	}

	public void clicarRegistrar() {
		esperarAteOElementoEstarClicavel(cadastroPage.getBtnRegister());
		clicar(cadastroPage.getBtnRegister());
	}

}

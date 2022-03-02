package br.com.advantage.login;

import br.com.advantage.utils.AcoesWeb;

public class LoginLogic extends AcoesWeb {

	private LoginPage login;

	public LoginLogic() {
		login = new LoginPage();
	}

	public void preencherUsuario(String usuario) {
		esperarAteOElementoEstarClicavel(login.getCmpUserName());
		limpaEInsereTexto(usuario, login.getCmpUserName());
	}

	public void preencherSenha(String senha) {
		esperarAteOElementoEstarClicavel(login.getCmpSenha());
		limpaEInsereTexto(senha, login.getCmpSenha());
	}

	public void clicarLogar() {
		esperarAteOElementoEstarClicavel(login.getBtnLogar());
		clicar(login.getBtnLogar());
	}

}

package br.com.maicol.advantage.pageObject.generic;

import static org.junit.Assert.assertTrue;

import br.com.maicol.util.AcoesWeb;

public class GenericLogic extends AcoesWeb {

	private GenericPage generic;

	public GenericLogic() {
		generic = new GenericPage();
	}

	public void navegar() {
		navega("http://advantageonlineshopping.com/#/");
	}

	public void clicarUser() {
		esperarAteOElementoEstarClicavel(generic.getBtnUser());
		click(generic.getBtnUser());
	}
	public void clicarUserLogout() {
		espera(1000);
		esperarAteOElementoEstarClicavel(generic.getBtnUserLogout());
		click(generic.getBtnUserLogout());
	}

	public void validarMensagemFinal() {
		try {
			esperarPresencaDoElementoDesejado(generic.getMsgValida());
			assertTrue(elementoVisivel(generic.getMsgValida()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clicarSignOut() {
		esperarAteOElementoEstarClicavel(generic.getBtnUser());
//		click(generic.getBtnUser());
		click(generic.getSignOut());
	}

}

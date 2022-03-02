package br.com.advantage.page.generic;

import static org.junit.Assert.assertTrue;

import br.com.advantage.utils.AcoesWeb;

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

	public void validarMensagemFinal() {
		try {
			esperarPresencaDoElementoDesejado(generic.getMsgValida());
			assertTrue(elementoVisivel(generic.getMsgValida()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package br.com.maicol.advantage.pageObject.consulta;

import static org.junit.Assert.assertTrue;

import br.com.maicol.util.AcoesWeb;

public class ConsultaLogic extends AcoesWeb{

	private ConsultaPage consultaPage;
	
	public ConsultaLogic () {
		consultaPage = new ConsultaPage();
	}

	public void clicaPesquisarProdutos() {
		esperarAteOElementoEstarClicavel(consultaPage.getPesquisarProduto());
		clicar(consultaPage.getPesquisarProduto());
	}

	public void digitarProduto(String produto) {
		esperarAteOElementoEstarClicavel(consultaPage.getDigitarProduto());
		limpaEInsereTexto(produto, consultaPage.getDigitarProduto());
	}

	public void validarMensagemFinal() {
		try {
			esperarPresencaDoElementoDesejado(consultaPage.getMsgValida());
			assertTrue(elementoVisivel(consultaPage.getMsgValida()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

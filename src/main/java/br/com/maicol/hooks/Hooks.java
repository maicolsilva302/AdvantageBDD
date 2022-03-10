package br.com.maicol.hooks;


import br.com.maicol.core.Driver;
import br.com.maicol.util.AcoesWeb;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Driver{
	
	@Before
	public static void inicializaNavegador(Scenario teste) {
		System.out.println("Inicio do teste: " + teste.getName());
	}

	@After
	public static void finalizaTeste(Scenario teste) {
		new AcoesWeb().screenShot(teste.getStatus(), teste.getName());
		System.out.println("Teste finalizado. Status do Teste: " + teste.getStatus());
		fechaNavegador();
	}
	

}

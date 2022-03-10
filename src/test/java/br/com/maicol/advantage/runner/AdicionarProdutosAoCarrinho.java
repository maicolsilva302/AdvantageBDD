package br.com.maicol.advantage.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java//br/com/maicol/advantage/features/AdicionarProdutosAoCarrinho.feature", 
	glue = { "" }, 
	tags = { "@web", "@adicionarProdutos" },
	plugin = {"pretty", "html:reports" }, 
	monochrome = true, 
	snippets = SnippetType.CAMELCASE, dryRun = false)

public class AdicionarProdutosAoCarrinho {

}

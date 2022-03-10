package br.com.maicol.advantage.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java//br/com/maicol/advantage/features/logout.feature", 
	glue = { "" }, 
	tags = { "@web", "@logout" },
	plugin = {"pretty", "html:reports" }, 
	monochrome = true, 
	snippets = SnippetType.CAMELCASE, dryRun = false)

public class Logout {

}

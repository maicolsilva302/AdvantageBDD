package br.com.advantage.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java//br/com/advantage/features/login.feature", 
	glue = { "" }, 
	tags = { "@web", "@login" },
	plugin = {"pretty", "html:reports" }, 
	monochrome = true, 
	snippets = SnippetType.CAMELCASE, dryRun = false)

public class Login {

}

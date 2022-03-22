package com.indra.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compraProductos.feature",
                glue = "com.indra.stepDefinitions",
                tags = "",
                monochrome = true, snippets = CAMELCASE)

public class ComprarRunner {
}

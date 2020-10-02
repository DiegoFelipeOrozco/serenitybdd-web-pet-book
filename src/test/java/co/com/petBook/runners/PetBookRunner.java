package co.com.petBook.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/visualizacion-imagenes.feature",
        glue = {"co.com.petBook.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class PetBookRunner {
}

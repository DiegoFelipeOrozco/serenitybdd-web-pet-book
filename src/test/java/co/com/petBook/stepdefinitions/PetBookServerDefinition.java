package co.com.petBook.stepdefinitions;

import co.com.petBook.questions.PetBookHome;
import co.com.petBook.userinterfaces.PetBookPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookServerDefinition {

    @Cuando("^(.*) especifica la dirección del servidor en el navegador$")
    @Dado("^que (.*) esté en la aplicacion$")
    public void abrirAplicacion(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.url(PetBookPage.HOME)
        );
    }

    @Entonces("^debe ver la aplicación con al menos (\\d+) imagen\\(es\\)$")
    public void deberiaVerImagenesEnPantalla(int cantidadImagenes) {
        theActorInTheSpotlight().should(seeThat(
            PetBookHome.hasAtLessAnAmountOfImagesOf(cantidadImagenes)
        ));
    }
}

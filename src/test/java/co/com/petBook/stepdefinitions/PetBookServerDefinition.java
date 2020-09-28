package co.com.petBook.stepdefinitions;

import co.com.petBook.questions.PetBookHome;
import co.com.petBook.userinterfaces.PetBookPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookServerDefinition {

    @Cuando("^(.*) especifica la direccion del servidor en el navegador$")
    public void someoneSpecifyServerAdressInABrowser(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.url(PetBookPage.HOME)
        );
    }


    @Entonces("^debe ver la aplicacion con al menos (\\d+) imagen\\(es\\)$")
    public void ShouldSeeImagesInAplication(int cantidadImagenes) {
        theActorInTheSpotlight().should(seeThat(
            PetBookHome.hasAtLessAnAmountOfImagesOf(cantidadImagenes)
        ));
    }
}

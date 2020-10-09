package co.com.petBook.stepdefinitions;

import co.com.petBook.questions.FotosGatos;
import co.com.petBook.tasks.Elegir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class VerAllStepDefinition {    

    @Cuando("^(.*) quiere deshacer el filtro$")
    public void quitarFiltro(String actor) {
        theActorCalled(actor).attemptsTo(Elegir.filtro("All"));
    }

    @Entonces("^debe ver todas las imagenes$")
    public void debeVerTodasLasImagenesDeGatosUnicamente() {
        theActorInTheSpotlight().should(seeThat(FotosGatos.comprobar()));
    }    
}
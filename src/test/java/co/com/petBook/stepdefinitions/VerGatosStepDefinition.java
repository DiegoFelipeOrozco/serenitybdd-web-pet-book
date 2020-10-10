package co.com.petBook.stepdefinitions;

import co.com.petBook.questions.FotosGatos;
import co.com.petBook.tasks.Elegir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class VerGatosStepDefinition {

    @Cuando("^filtra por Gato$")
    @Y("este filtrada por Gato")
    public void filtarPorGato() {
        theActorInTheSpotlight().attemptsTo(Elegir.filtro("Gato"));
    }

    @Entonces("^debe ver todas las imagenes de gatos unicamente$")
    public void debeVerTodasLasImagenesDeGatosUnicamente() {
        theActorInTheSpotlight().should(seeThat(FotosGatos.comprobar()));
    }    
}
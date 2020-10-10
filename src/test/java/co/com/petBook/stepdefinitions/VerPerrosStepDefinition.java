package co.com.petBook.stepdefinitions;

import co.com.petBook.questions.FotosPerros;
import co.com.petBook.tasks.Elegir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class VerPerrosStepDefinition {

    @Cuando("^filtra por Perro$")
    @Y("este filtrada por Perro")
    public void filtrarPorPerro() {
        theActorInTheSpotlight().attemptsTo(Elegir.filtro("Perro"));
    }

    @Entonces("^debe ver todas las imagenes de perros unicamente$")
    public void debeVerTodasLasImagenesDePerrosUnicamente() {
        theActorInTheSpotlight().should(seeThat(FotosPerros.comprobar()));
    }
}
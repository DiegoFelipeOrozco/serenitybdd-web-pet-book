package co.com.petBook.stepdefinitions;

import co.com.petBook.questions.TheFocusedImage;
import co.com.petBook.userinterfaces.PetBookPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.RememberThat;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookStepDefinition {

    @Cuando("^(.*) elige una imagen$")
    public void unUsuarioEligeUnaImagen(String actor) {
        final Actor theActor = theActorCalled(actor);

        theActor.attemptsTo(
                Open.url(PetBookPage.HOME),
                RememberThat.theValueOf("imagen seleccionada").is(
                        "assets/images/perro1.jpg"),
                RememberThat.theValueOf("alto de la imagen").is(
                        "170px"),
                RememberThat.theValueOf("ancho de la imagen").is(
                        "240px"),
                Click.on(PetBookPage.FIRST_IMAGE)
        );
    }

    @Entonces("^debe ver dicha imagen de mayor tamaño$")
    public void debeVerDichaImagenDelTamañoDeLaPantalla() {
        theActorInTheSpotlight().should(seeThat(
                TheFocusedImage.isSourcedFrom(theActorInTheSpotlight().<String>recall("imagen seleccionada")).
                        andIsBiggerThan(
                                theActorInTheSpotlight().<String>recall("alto de la imagen"),
                                theActorInTheSpotlight().<String>recall("ancho de la imagen"))
        ));
    }
}

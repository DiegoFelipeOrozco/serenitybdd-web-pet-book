package co.com.petBook.tasks;

import co.com.petBook.userinterfaces.GoogleResultadosPage;
import co.com.petBook.userinterfaces.GoogleSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class  BuscarEnGoogle implements Task {
    private String palabra;

    public BuscarEnGoogle(String palabra) {
        this.palabra = palabra;
    }

    public static Performable laPalabra(String palabra) {
        return instrumented(BuscarEnGoogle.class, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(GoogleSearchPage.GOOGLE_HOME_PAGE),
                Enter.theValue(palabra).into(GoogleSearchPage.CAMPO_BUSQUEDA),
                Hit.the(Keys.ENTER).into(GoogleSearchPage.CAMPO_BUSQUEDA),
                WaitUntil.the(GoogleResultadosPage.RESULTADOS_BUSQUEDA, isVisible())
        );
    }
}

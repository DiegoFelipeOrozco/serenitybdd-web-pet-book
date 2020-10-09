package co.com.petBook.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.petBook.userinterfaces.PetBookPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Elegir implements Task {

    private String filtro;

    public Elegir(String filtro) { this.filtro = filtro; }

    public static Performable filtro(String filtro) { return instrumented(Elegir.class, filtro); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(filtro == "Perro") {
            actor.attemptsTo(
                Open.url(HOME),
                Click.on(BOTON_PERRO));
        }else if(filtro == "Gato"){
            actor.attemptsTo(
                Open.url(HOME),
                Click.on(BOTON_GATO));
        }else{
            actor.attemptsTo(
                Open.url(HOME),
                Click.on(BOTON_ALL));
        }
    }
}
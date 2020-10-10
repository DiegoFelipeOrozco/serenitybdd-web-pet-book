package co.com.petBook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.petBook.userinterfaces.PetBookPage.*;

public class FotosPerros implements Question<Boolean>{

    public FotosPerros(){}

    public static FotosPerros comprobar(){ return new FotosPerros(); }

    @Override
    public Boolean answeredBy(Actor actor) {
        return FOTO5.resolveFor(actor).isVisible();
    }    
}
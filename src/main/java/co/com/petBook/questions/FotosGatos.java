package co.com.petBook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.petBook.userinterfaces.PetBookPage.*;

public class FotosGatos implements Question<Boolean>{

    public FotosGatos(){}

    public static FotosGatos comprobar(){ return new FotosGatos(); }

    @Override
    public Boolean answeredBy(Actor actor) {
        return FOTO4.resolveFor(actor).isVisible();
    }    
}
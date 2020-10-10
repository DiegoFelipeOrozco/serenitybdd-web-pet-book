package co.com.petBook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.petBook.userinterfaces.PetBookPage.*;

public class FotosAll implements Question<Boolean>{

    public FotosAll(){}

    public static FotosAll comprobar(){ return new FotosAll(); }

    @Override
    public Boolean answeredBy(Actor actor) {
        return FOTO5.resolveFor(actor).isVisible() && FOTO4.resolveFor(actor).isVisible();
    }    
}
package co.com.petBook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;

public class PetBookHome implements Question<Boolean> {
    private final int cantidadImagenes;

    public PetBookHome(int cantidadImagenes) {
        this.cantidadImagenes = cantidadImagenes;
    }

    public static PetBookHome hasAtLessAnAmountOfImagesOf(int cantidadImagenes) {
        return new PetBookHome(cantidadImagenes);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Value.of(
                Target.the("Pet book images").locatedBy("//img[@src]")
        ).viewedBy(actor).resolveAll().size() >= cantidadImagenes;
    }
}

package co.com.petBook.questions;

import co.com.petBook.userinterfaces.GoogleResultadosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

public class PrimerResultadoGoogle implements Question<Boolean> {
    private String resultado;

    public PrimerResultadoGoogle(String resultado){
        this.resultado = resultado;
    }

    public static PrimerResultadoGoogle es(String resultado){
        return new PrimerResultadoGoogle(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEncontrado = Attribute.of(GoogleResultadosPage.PRIMER_RESULTADO).named("href").viewedBy(actor).asString();
        return resultadoEncontrado.contains(resultado);
    }
}

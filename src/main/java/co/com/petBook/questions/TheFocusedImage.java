package co.com.petBook.questions;

import co.com.petBook.userinterfaces.PetBookPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CSSValue;
import net.serenitybdd.screenplay.targets.Target;
import org.jetbrains.annotations.NotNull;

public class TheFocusedImage implements Question<Boolean> {

    private String src;
    private String height;
    private String width;

    private TheFocusedImage(String source) {
        this.src=source;
    }

    public static TheFocusedImage isSourcedFrom(String source) {
        return new TheFocusedImage(source);
    }

    public TheFocusedImage andIsBiggerThan(String height, String width) {
        this.height=height;
        this.width=width;
        return this;
    }

    public Boolean answeredBy(Actor actor) {
        if (height != null && width != null) {
            return isCorrectedSourced(actor) && isBigger(actor);
        } else {
            return isCorrectedSourced(actor);
        }
    }

    @NotNull
    private Boolean isBigger(Actor actor) {
        final Target imagenEnfocada = PetBookPage.FOCUSED_IMAGE;
        String unidadMedida;
        int valorMedido;

        Boolean answer;

        try {
            unidadMedida = height.replaceFirst("\\d+", "");
            valorMedido = Integer.valueOf(height.replaceFirst(unidadMedida, ""));
            answer = Integer.valueOf(CSSValue.of(imagenEnfocada).named("height").viewedBy(actor).asString().replaceFirst(unidadMedida, "")).compareTo(valorMedido) > 0;
        } catch (NumberFormatException e) {
            answer = false;
        }

        try {
            unidadMedida = width.replaceFirst("\\d+", "");
            valorMedido = Integer.valueOf(width.replaceFirst(unidadMedida, ""));
            answer = answer && Integer.valueOf(CSSValue.of(imagenEnfocada).named("width").viewedBy(actor).asString().replaceFirst(unidadMedida, "")).compareTo(valorMedido) > 0;
        } catch (NumberFormatException e) {
            answer = false;
        }
        return answer;
    }

    private boolean isCorrectedSourced(Actor actor) {
        return CSSValue.of(PetBookPage.FOCUSED_IMAGE).named("background-image").viewedBy(actor).asString().contains(src);
    }
}

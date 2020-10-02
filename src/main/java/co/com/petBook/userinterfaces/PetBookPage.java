package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class PetBookPage {

    public static final String HOME="http://localhost:4200";

    public static final Target FIRST_IMAGE = the("primera imagen").
            locatedBy("//li[1]//img[@class='img' and @width='240' and @height='170']");

    public static final Target FOCUSED_IMAGE = the("imagen enfocada").
            locatedBy("//div[@class='img-container']");
}

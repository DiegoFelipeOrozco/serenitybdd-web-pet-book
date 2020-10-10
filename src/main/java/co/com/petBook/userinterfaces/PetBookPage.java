package co.com.petBook.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class PetBookPage {

    public static final String HOME="http://localhost:4200";

    public static final Target FIRST_IMAGE = the("primera imagen").
            locatedBy("//li[1]//img[@class='img' and @width='240' and @height='170']");

    public static final Target FOCUSED_IMAGE = the("imagen enfocada").
            locatedBy("//div[@class='img-container']");

    public static final Target FOTO5 = the("Ultima foto").located(By.xpath("//a[@href='/image/5']"));
    public static final Target FOTO4= the("Penultima foto").located(By.xpath("//a[@href='/image/4']"));
    public static final Target BOTON_PERRO = the("Boton Perro").located(By.xpath("//button[text()='Perro']"));
    public static final Target BOTON_GATO = the("Boton Gato").located(By.xpath("//button[text()='Gato']"));
    public static final Target BOTON_ALL = the("Boton All").located(By.xpath("//button[text()='All']"));
}

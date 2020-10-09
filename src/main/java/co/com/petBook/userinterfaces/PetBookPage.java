package co.com.petBook.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.targets.Target.the;

public class PetBookPage {

    public static final String HOME="http://localhost:4200";
    
    public static final Target FOTO5 = Target.the("Ultima foto").located(By.xpath("//a[@href='/image/5']"));
    public static final Target FOTO4= Target.the("Penultima foto").located(By.xpath("//a[@href='/image/4']"));    
    public static final Target BOTON_PERRO = Target.the("Boton Perro").located(By.xpath("//button[@id='botonPerro']"));
    public static final Target BOTON_GATO = Target.the("Boton Perro").located(By.xpath("//button[@id='botonGato']"));
    public static final Target BOTON_ALL = Target.the("Boton ALL").located(By.xpath("//button[@id='botonAll']"));
    public static final Target FIRST_IMAGE = the("primera imagen").locatedBy("//li[1]//img[@class='img' and @width='240' and @height='170']");
    public static final Target FOCUSED_IMAGE = the("imagen enfocada").locatedBy("//div[@class='img-container']");
}

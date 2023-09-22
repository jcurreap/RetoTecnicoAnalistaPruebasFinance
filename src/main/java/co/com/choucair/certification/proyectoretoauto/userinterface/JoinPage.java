package co.com.choucair.certification.proyectoretoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinPage extends Object{
    public static final Target JOIN_BUTTON = Target.the("button for register").located(By.xpath("//*[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
}

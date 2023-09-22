package co.com.choucair.certification.proyectoretoauto.tasks;

import co.com.choucair.certification.proyectoretoauto.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistroSteptwo implements Task {

    private String strpstal;
    @Managed
    private WebDriver driver;
    @FindBy(id="city")
    private WebElement elemento;

    private String strcity;

    private String strcountry;

    public RegistroSteptwo(String strpstal, String strcity, String strcountry) {
        this.strpstal = strpstal;
        this.strcity = strcity;
        this.strcountry = strcountry;

    }

    public static RegistroSteptwo dataAd(String strpstal, String strcity, String strcountry) {
        return Tasks.instrumented(RegistroSteptwo.class, strpstal, strcity, strcountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(strcity).into(RegisterPage.SELECT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(RegisterPage.SELECT_CITY),
                Hit.the(Keys.ENTER).into(RegisterPage.SELECT_CITY),
                Enter.theValue(strpstal).into(RegisterPage.INPUT_POSTAL),
                //Click.on(RegisterPage.SELECT_COUNTRT_SPAN),
                //Click.on(By.xpath("( //div[contains(text(),'"+strcountry+"')])[1]")),
                Click.on(RegisterPage.BUTTON_BLUE)

        );

    }
}

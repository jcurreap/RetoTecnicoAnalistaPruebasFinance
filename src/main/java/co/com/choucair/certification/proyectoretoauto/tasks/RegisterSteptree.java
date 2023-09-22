package co.com.choucair.certification.proyectoretoauto.tasks;

import co.com.choucair.certification.proyectoretoauto.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class RegisterSteptree implements Task {
    private String strdevice;
    private String strmodel;
    private String stroperating;

    public RegisterSteptree(String strdevice, String strmodel, String stroperating) {

        this.strdevice = strdevice;
        this.strmodel = strmodel;
        this.stroperating= stroperating;
    }

    public static RegisterSteptree datadivece(String strdevice, String strmodel, String stroperating) {
        return Tasks.instrumented(RegisterSteptree.class, strdevice, strmodel, stroperating);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                        Click.on(RegisterPage.SELECT_DEVICE_SPAN),
                        Click.on(By.xpath("//div[contains(text(),'"+strdevice+"')]")),
                        Click.on(RegisterPage.SELECT_MODEL_SPAN),
                        Click.on(By.xpath("( //div[contains(text(),'"+strmodel+"')])[1]")),
                        Click.on(RegisterPage.SELECT_OPERATING_SPAN),
                        Click.on(By.xpath("( //div[contains(text(),'"+stroperating+"')])[1]")),
                        Click.on(RegisterPage.BUTTON_BLUE)


                );

    }
}

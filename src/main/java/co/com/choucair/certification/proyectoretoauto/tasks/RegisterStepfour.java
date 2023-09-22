package co.com.choucair.certification.proyectoretoauto.tasks;

import co.com.choucair.certification.proyectoretoauto.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class RegisterStepfour implements Task {

    private String strpassword;

    public RegisterStepfour(String strpassword) {
        this.strpassword = strpassword;
    }

    public static RegisterStepfour laststep(String strpassword) {
        return Tasks.instrumented(RegisterStepfour.class, strpassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strpassword).into(RegisterPage.INPUT_PASSWORD),
                Enter.theValue(strpassword).into(RegisterPage.INPUT_CONFIRMPASSWORD),
                Scroll.to(RegisterPage.SELECT_CHERKMARKTRESSCROLL),
                Click.on(RegisterPage.SELECT_CHERKMARK),
                Click.on(RegisterPage.SELECT_CHERKMARKDOS),
                Click.on(RegisterPage.SELECT_CHERKMARKTRES),
                Click.on(RegisterPage.BUTTON_BLUE)
        );
    }
}

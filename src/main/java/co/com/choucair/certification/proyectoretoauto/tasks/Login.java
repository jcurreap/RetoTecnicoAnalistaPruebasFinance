package co.com.choucair.certification.proyectoretoauto.tasks;

import co.com.choucair.certification.proyectoretoauto.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinPage.JOIN_BUTTON));

    }
}

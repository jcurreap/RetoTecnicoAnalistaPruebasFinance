package co.com.choucair.certification.proyectoretoauto.tasks;

import co.com.choucair.certification.proyectoretoauto.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterStepOne implements Task {

    private String month;
    private String day;
    private String year;
    private String language;

    private String stremail;

    private String strlasname;

    private String strname;

    private String strlanguage;

    public RegisterStepOne(String month, String day, String year, String language, String strname, String strlasname, String stremail, String strlanguage) {
        this.month = month;
        this.day = day;
        this.year = year;
        this.language = language;
        this.strname = strname;
        this.stremail = stremail;
        this.strlasname = strlasname;
        this.strlanguage = strlanguage;
    }


    public static RegisterStepOne dataRe(String month, String day, String year, String language, String strname, String strlasname, String stremail, String strlanguage) {
        return Tasks.instrumented(RegisterStepOne.class, month, day, year, language, strname, strlasname, stremail, strlanguage);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //System.out.println("Cualquier cosa"+month);
        actor.attemptsTo(
                Enter.theValue(strname).into(RegisterPage.INPUT_NAME),
                Enter.theValue(strlasname).into(RegisterPage.INPUT_LASTNAME),
                Enter.theValue(stremail).into(RegisterPage.INPUT_ADDREESS),
                SelectFromOptions.byVisibleText(month).from(RegisterPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(day).from(RegisterPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(year).from(RegisterPage.SELECT_YEAR),
                Click.on(RegisterPage.BUTTON_BLUE)
    );

        //actor.attemptsTo(Enter.theValue(strlanguage).into(RegisterPage.INPUT_LENGUAGE));
        //actor.attemptsTo(Click.on(RegisterPage.SELECT_LENGUAGE));
        //actor.attemptsTo(SelectFromOptions.byValue(year).from(RegisterPage.SELECT_YEAR));
        //actor.attemptsTo(SelectFromOptions.byValue(language).from(RegisterPage.SELECT_LENGUAGE));

    }
}

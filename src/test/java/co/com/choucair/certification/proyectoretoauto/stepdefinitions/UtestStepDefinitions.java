package co.com.choucair.certification.proyectoretoauto.stepdefinitions;

import co.com.choucair.certification.proyectoretoauto.model.UtestData;
import co.com.choucair.certification.proyectoretoauto.questions.Answer;
import co.com.choucair.certification.proyectoretoauto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than JP wants to use the utest page$")
    public void thanJPWantsToUseTheUtestPage() {
        OnStage.theActorCalled("JP").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }


    @When("^JP registers your data$")
    public void jpRegistersYourData(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegisterStepOne.dataRe(utestData.get(0).getMonth(),
                utestData.get(0).getDay(), utestData.get(0).getYear(), utestData.get(0).getLanguage(),
                utestData.get(0).getStrname(), utestData.get(0).getStrlasname(),utestData.get(0).getStremail(),
                utestData.get(0).getStrlanguage()),
                RegistroSteptwo.dataAd(utestData.get(0).getStrpstal(), utestData.get(0).getStrcity(), utestData.get(0).getStrcountry()),
                RegisterSteptree.datadivece(utestData.get(0).getStrdevice(), utestData.get(0).getStrmodel(), utestData.get(0).getStroperating()),
                RegisterStepfour.laststep(utestData.get(0).getStrpassword())
        );


    }

    @Then("^JP will have a new user and will be able to enjoy the services of utest$")
    public void jpWillHaveANewUserAndWillBeAbleToEnjoyTheServicesOfUtest(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getQuestion())));

    }
}

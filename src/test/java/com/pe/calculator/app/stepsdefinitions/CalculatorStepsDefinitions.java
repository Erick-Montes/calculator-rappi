package com.pe.calculator.app.stepsdefinitions;

import com.pe.calculator.app.questions.OperationQuestions;
import com.pe.calculator.app.tasks.Calculate;
import com.pe.calculator.app.tasks.EnterAplication;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static com.pe.calculator.app.userinterface.Calculator.*;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorStepsDefinitions {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el (.*) ingresa a la aplicacion$")
    public void queElClienteIngresaAALaAplicacion(String actor) throws InterruptedException {
        theActorCalled(actor).wasAbleTo(EnterAplication.options());
    }

    @When("^el ingresa el numeroUno (.*) la operacion (.*) y el numeroDos (.*)$")
    public void elIngresaElNumeroNumeroUnoLaOperacionOperacionYElNumeroNumeroDos(String numeroUno, String operaciones, String numeroDos) {
        theActorInTheSpotlight().attemptsTo(Calculate.options(numeroUno), Calculate.options(operaciones), Calculate.options(numeroDos));
    }

    @Then("^el visualiza que el total (.*) es correcto$")
    public void elVisualizaQueElTotalTotalEsCorrecto(String total) {
        theActorInTheSpotlight().should(seeThat(OperationQuestions.is(RESULT), equalTo(total)));
    }
}

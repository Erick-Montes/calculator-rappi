package com.pe.calculator.app.tasks;

import com.pe.calculator.app.interactions.SelectOptions;
import com.pe.calculator.app.interactions.WaitElementClickable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static com.pe.calculator.app.userinterface.Calculator.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Calculate implements Task {
    private final String value;
    private final Target option;


    public Calculate(String value, Target option) {
        this.value = value;
        this.option = option;
    }

    @Override
    @Step("{0} perform select the category #value ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElementClickable.in(BUTTON)
                , SelectOptions.por(option, value));
    }

    public static Calculate options(String value) {
        return instrumented(Calculate.class, value, BUTTON);
    }
}

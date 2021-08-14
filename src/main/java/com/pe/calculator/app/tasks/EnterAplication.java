package com.pe.calculator.app.tasks;

import com.pe.calculator.app.interactions.WaitElementClickable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.pe.calculator.app.userinterface.Calculator.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterAplication implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElementClickable.in(BUTTON));
    }

    public static EnterAplication options() {
        return instrumented(EnterAplication.class);
    }
}

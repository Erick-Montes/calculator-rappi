package com.pe.calculator.app.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitElementClickable implements Interaction {
    private final Target target;

    public WaitElementClickable(Target target) {
        this.target = target;
    }

    @Override
    @Step("{0} wait for element")
    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(WaitUntil.the(target, isClickable()));
        target.resolveFor(actor).waitUntilClickable();
//        actor.attemptsTo(WaitUntil.the(target, isClickable()).forNoMoreThan(60).seconds());

    }

    public static WaitElementClickable in(Target target) {
        return instrumented(WaitElementClickable.class, target);
    }
}

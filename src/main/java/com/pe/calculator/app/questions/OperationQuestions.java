package com.pe.calculator.app.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class OperationQuestions {
    private final Target target;

    public OperationQuestions(Target target) {
        this.target = target;
    }

    public static Question<String> is(Target target) {
        return actor -> target.resolveFor(actor).getText();
    }
}

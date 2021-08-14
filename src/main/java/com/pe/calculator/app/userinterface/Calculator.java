package com.pe.calculator.app.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Calculator {
    public static final Target BUTTON = Target.the("aplic button").locatedBy("//*[@class='android.widget.Button']");
    public static final Target RESULT = Target.the("result").locatedBy("//android.widget.TextView[@resource-id='com.google.android.calculator:id/result_preview']");
}

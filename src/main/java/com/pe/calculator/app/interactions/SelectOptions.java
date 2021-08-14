package com.pe.calculator.app.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectOptions implements Interaction {

	private final String value;
	private final Target target;

	public SelectOptions(Target target, String value) {
		this.target=target;
		this.value = value;
	}

	@Override
	@Step("{0} Filtered by #value and click on the resulting item")
	public <T extends Actor> void performAs(T actor) {
//		List<WebElementFacade> elementList = target.resolveAllFor(actor);
		
//		WebElement elemento=target.resolveFor(actor);
//		List<WebElement> list=elemento.findElements(By.xpath(""));
		
//		List<WebElement> elementList=BrowseTheWeb.as(actor).getDriver().findElements(By.xpath(target.getCssOrXPathSelector())); 
		
		List<WebElementFacade> elementList = target.resolveAllFor(actor);
		for (WebElementFacade elementFacade : elementList) {
			System.out.println(elementFacade.getText()+"------------?");
			if (elementFacade.getText().equals(value)) {
				elementFacade.click();
				break;
			}
		}
	}

	public static SelectOptions por(Target target,String value) {
		return instrumented(SelectOptions.class,target, value);
	}
}

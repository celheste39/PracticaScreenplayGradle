package com.iuvity.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.iuvity.userInterface.ContactanosUI.TXT_NOMBRE;

public class ScrollAElemento implements Interaction {

    private static WebDriver driver;

    @Override
    public <T extends Actor> void performAs(T t) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", TXT_NOMBRE);
    }
    public static ScrollAElemento ir_a(){
        return Instrumented.instanceOf(ScrollAElemento.class).withProperties();
    }
}

package com.iuvity.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SeleccionDrop implements Interaction {
    private final Target element;
    private final int indice;

    public SeleccionDrop(Target element, int indice) {
        this.element = element;
        this.indice = indice;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade listUbicacion = element.resolveFor(actor);
        List<WebElement> opciones = listUbicacion.findElements(By.xpath("//option[@value]"));
        opciones.get(indice).click();
    }

    public static SeleccionDrop indice(Target element, int indice){
        return Instrumented.instanceOf(SeleccionDrop.class).withProperties(element, indice);
    }
}

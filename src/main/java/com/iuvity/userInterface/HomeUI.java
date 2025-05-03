package com.iuvity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target BTN_CONTACTO = Target.
            the("boton para ir al formulario de contacto").
            locatedBy("(//a[@class='pwr-cta_button '])[2]");
}

package com.iuvity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.iuvity.userInterface.ContactanosUI.LBL_BIENVENIDA;

public class ValidarElMensaje implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LBL_BIENVENIDA.resolveFor(actor).getText();
    }
    public static Question<String> value(){
        return new ValidarElMensaje();
    }
}

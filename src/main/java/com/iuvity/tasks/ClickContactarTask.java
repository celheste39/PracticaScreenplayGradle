package com.iuvity.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.iuvity.userInterface.HomeUI.*;

public class ClickContactarTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONTACTO)
        );
    }

    public static ClickContactarTask on(){
        return Instrumented.instanceOf(ClickContactarTask.class).withProperties();
    }
}

package com.iuvity.tasks;

import com.iuvity.interactions.SeleccionDrop;
import com.iuvity.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.iuvity.userInterface.ContactanosUI.*;

public class LlenadoFormularioContactoTask implements Task {
    private static ArrayList<Map<String, String>> leerExcel =  new ArrayList<Map<String, String>>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.readExcel("dataIuvity.xlsx", "dataForm");
        }catch (IOException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Enter.keyValues(leerExcel.get(0).get("txtCampos")).into(TXT_NOMBRE),
                Enter.keyValues(leerExcel.get(1).get("txtCampos")).into(TXT_APELLIDO),
                Enter.keyValues(leerExcel.get(2).get("txtCampos")).into(TXT_TELEFONO),
                Enter.keyValues(leerExcel.get(3).get("txtCampos")).into(TXT_CORREO),
                Enter.keyValues(leerExcel.get(4).get("txtCampos")).into(TXT_CARGO),
                Enter.keyValues(leerExcel.get(5).get("txtCampos")).into(TXT_EMPRESA),
                SeleccionDrop.indice(SLT_COUNTRY, 12)
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static LlenadoFormularioContactoTask on(){
        return Instrumented.instanceOf(LlenadoFormularioContactoTask.class).withProperties();
    }
}

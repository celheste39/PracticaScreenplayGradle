package com.iuvity.stepDefinitions;

import com.iuvity.questions.ValidarElMensaje;
import com.iuvity.tasks.ClickContactarTask;
import com.iuvity.tasks.LlenadoFormularioContactoTask;
import com.iuvity.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ContactoStepDefinitions {
    private static ArrayList<Map<String, String>> leerExcel =  new ArrayList<Map<String, String>>();
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que me encuentro en el sitio web de Uvity")
    public void queMeEncuentroEnElSitioWebDeUvity() {
        try {
            leerExcel = Excel.readExcel("dataIuvity.xlsx", "dominio");
        }catch (IOException e) {
            e.printStackTrace();
        }
        OnStage.theActorCalled("Pearson").wasAbleTo(Open.url(leerExcel.get(0).get("url")));
    }
    @Cuando("Le doy clic al boton contactanos")
    public void leDoyClicAlBotonContactanos() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickContactarTask.on());
    }
    @Cuando("Lleno el formulario con mi informacion de contacto")
    public void llenoElFormularioConMiInformacionDeContacto() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenadoFormularioContactoTask.on());
    }
    @Entonces("Valido el texto al final del formulario")
    public void validoElTextoAlFinalDelFormulario() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarElMensaje.value()));
    }


}

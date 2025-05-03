package com.iuvity.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ContactanosUI {
    public static final Target TXT_NOMBRE = Target.
            the("campo de texto del nombre").
            locatedBy("//input[@id='firstname-e51b2987-1ee8-48f9-9671-b74a957be20e_3701']");
    public static final Target TXT_APELLIDO = Target.
            the("campo de texto del apellido").
            locatedBy("//input[@name='lastname']");
    public static final Target TXT_TELEFONO = Target.
            the("campo de texto del telefono").
            locatedBy("//input[@id='phone-e51b2987-1ee8-48f9-9671-b74a957be20e_3701']");
    public static final Target TXT_CORREO = Target.
            the("campo de texto del correo").
            locatedBy("//input[starts-with(@id,'emai')]");
    public static final Target TXT_CARGO = Target.
            the("campo de texto del cargo").
            locatedBy("//*[@id='jobtitle-e51b2987-1ee8-48f9-9671-b74a957be20e_3701']");
    public static final Target TXT_EMPRESA = Target.
            the("campo de texto de la empresa").
            locatedBy("(//input [@placeholder])[6]");
    public static final Target SLT_COUNTRY = Target.
            the("selector del pais").
            locatedBy("(//a[@class='pwr-cta_button '])[2]");

}

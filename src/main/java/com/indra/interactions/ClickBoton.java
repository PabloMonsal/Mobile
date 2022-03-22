package com.indra.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class ClickBoton{

    @Step("{} da click al boton")
    public static Performable click(Target objeto){
        return Task.where("El usuario da un click",
                Click.on(objeto)
        );
    }

}

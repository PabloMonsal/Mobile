package com.indra.tasks;

import com.indra.interactions.ClickBoton;
import com.indra.user_interfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Loguearse implements Task {

    public Loguearse() {
    }

    @Step("{0} llena el formulario")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LlenarFormulario.llenarFormularioLogin(),
                ClickBoton.click(LoginUI.BUTTON_LOGIN)
        );
    }

    public static Loguearse loguearse(){
        return Tasks.instrumented(Loguearse.class);
    }
}

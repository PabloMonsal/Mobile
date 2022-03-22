package com.indra.tasks;

import com.indra.user_interfaces.MenuUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class Desloguearse implements Task {

    public Desloguearse() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuUI.BUTTON_MENU.waitingForNoMoreThan(Duration.ofSeconds(8))),
                Click.on(MenuUI.BUTTON_CERRARSESSION.waitingForNoMoreThan(Duration.ofSeconds(8)))
        );
    }

    public static Desloguearse desloguearse(){
        return Tasks.instrumented(Desloguearse.class);
    }

}

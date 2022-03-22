package com.indra.tasks;

import com.indra.user_interfaces.ProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class AgregarCarrito implements Task {

    public AgregarCarrito() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosUI.AGREGAR_PRODUCT("2").waitingForNoMoreThan(Duration.ofSeconds(8))),
                Click.on(ProductosUI.AGREGAR_PRODUCT("1").waitingForNoMoreThan(Duration.ofSeconds(8)))
        );
    }

    public static AgregarCarrito agregar(){
        return Tasks.instrumented(AgregarCarrito.class);
    }
}

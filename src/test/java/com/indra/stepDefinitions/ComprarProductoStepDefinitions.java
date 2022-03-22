package com.indra.stepDefinitions;

import com.indra.questions.ValidacionCarrito;
import com.indra.questions.ValidacionDeslogueo;
import com.indra.tasks.AgregarCarrito;
import com.indra.tasks.Desloguearse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductoStepDefinitions {

    @When("el compra los productos")
    public void elCompraLosProductos() {
        theActorInTheSpotlight().attemptsTo(AgregarCarrito.agregar());
    }

    @Then("el deberia el carrito con {string} items")
    public void elDeberiaElCarritoConItems(String items) {
        theActorInTheSpotlight().attemptsTo(ValidacionCarrito.validarItemCarrito(items));
    }

    @And("el se desloguea")
    public void elSeDesloguea() {
        theActorInTheSpotlight().attemptsTo(
                Desloguearse.desloguearse(),
                ValidacionDeslogueo.validarItemCarrito()
        );
    }
}

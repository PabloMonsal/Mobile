package com.indra.stepDefinitions;

import com.indra.questions.ValidacionCarrito;
import com.indra.questions.ValidacionDeslogueo;
import com.indra.tasks.AgregarCarrito;
import com.indra.tasks.Desloguearse;
import com.indra.tasks.Loguearse;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesionStepDefinitions {

    @Managed(driver = "appium")
    private AppiumDriver driver;

    @Before
    public void iniciar(){
        setTheStage(new OnlineCast());
        theActorCalled("Usuario");
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @Given("el se loguea")
    public void elSeLoguea() {
        theActorInTheSpotlight().attemptsTo(Loguearse.loguearse());
    }



}

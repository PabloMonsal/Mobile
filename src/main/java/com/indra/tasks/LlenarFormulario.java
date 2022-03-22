package com.indra.tasks;

import com.indra.user_interfaces.LoginUI;
import com.indra.utils.PropertiesLoader;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import java.time.Duration;

public class LlenarFormulario {

    private static final PropertiesLoader properties = PropertiesLoader.getInstance();

    public static Performable llenarFormularioLogin(){
        return Task.where("{0} llena el formulario con la data del usuario",
                Enter.theValue(properties.getProperty("userLogin")).into(LoginUI.INPUT_USERNAME.waitingForNoMoreThan(Duration.ofSeconds(8))),
                Enter.theValue(properties.getProperty("passwordLogin")).into(LoginUI.INPUT_PASSWORD)
        );
    }
}

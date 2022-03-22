package com.indra.questions;

import com.indra.user_interfaces.LoginUI;
import com.indra.user_interfaces.ProductosUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidacionDeslogueo {

    public ValidacionDeslogueo() {
    }

    public static Performable validarItemCarrito(){
        return Task.where("{0} validacion deslogueo",
                Ensure.that(LoginUI.BUTTON_LOGIN).isEnabled()
        );
    }
}

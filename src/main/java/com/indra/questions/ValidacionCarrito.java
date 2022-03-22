package com.indra.questions;

import com.indra.user_interfaces.ProductosUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidacionCarrito {

    public ValidacionCarrito() {
    }

    public static Performable validarItemCarrito(String items){
        return Task.where("{0} validacion carrito",
                Ensure.that(ProductosUI.TEXT_ITEMCARRITO).text().isEqualToIgnoringCase(items)
        );
    }

}

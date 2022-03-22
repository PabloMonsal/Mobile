package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductosUI {

    public ProductosUI() {
    }

    public static final Target TEXT_ITEMCARRITO = the("Texto del numero de items en el carrito")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Carrito']/android.view.ViewGroup/android.widget.TextView"))
            .locatedForIOS(By.xpath(""));

    public static final Target AGREGAR_PRODUCT(String id){ return the("Boton agregar carrito")
            .locatedForAndroid(By.xpath("(//android.view.ViewGroup[@content-desc='test-A\u00D1ADIR A CARRITO'])["+id+"]"))
            .locatedForIOS(By.xpath(""));}
}

package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class MenuUI {

    public MenuUI() {
    }

    public static final Target BUTTON_MENU = the("Botton menu")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView"))
            .locatedForIOS(By.xpath(""));
    public static final Target BUTTON_CERRARSESSION = the("Botton menu")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-CERRAR SESION']"))
            .locatedForIOS(By.xpath(""));

}

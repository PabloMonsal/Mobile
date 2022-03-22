package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginUI {

    public LoginUI() {
    }

    public static final Target INPUT_USERNAME = the("Input username")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Usuario']"))
            .locatedForIOS(By.xpath(""));
    public static final Target INPUT_PASSWORD = the("Input password")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Contrase\u00F1a']"))
            .locatedForIOS(By.xpath(""));
    public static final Target BUTTON_LOGIN = the("Button login")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"))
            .locatedForIOS(By.xpath(""));

}

package co.com.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")
public class CheckSignInPage {
    public static final Target Profile_button = Target.the("terms button").locatedBy("//summary[@aria-label='View profile and more']");

}

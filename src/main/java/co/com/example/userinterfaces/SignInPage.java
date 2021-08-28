package co.com.example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class SignInPage extends PageObject {

    public static final Target terms_button = Target.the("terms button").locatedBy("//a[normalize-space()='Terms']");
    public static final Target privacy_button = Target.the("terms button").locatedBy("//a[normalize-space()='Privacy']");
    public static final Target security_button = Target.the("terms button").locatedBy("//a[normalize-space()='Security']");
    public static final Target Contact_button = Target.the("terms button").locatedBy("//a[normalize-space()='Contact GitHub']");
    public static final Target new_account_button = Target.the("terms button").locatedBy("//a[normalize-space()='Create an account']");
    public static final Target Forgot_password_button = Target.the("terms button").locatedBy("//a[normalize-space()='Forgot password?']");
    public static final Target user_input = Target.the("terms button").locatedBy("//input[@id='login_field']");
    public static final Target password_input = Target.the("terms button").locatedBy("//input[@id='password']");
    public static final Target signIn_Button = Target.the("terms button").locatedBy("//input[@name='commit']");

}

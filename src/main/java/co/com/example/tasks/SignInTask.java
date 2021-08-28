package co.com.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.example.userinterfaces.SignInPage.*;
import static co.com.example.userinterfaces.CheckSignInPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignInTask implements Task {

    private String user, password;

    public SignInTask(String user, String password){
        this.user = user;
        this.password = password;
    }

    public static SignInTask whitUserAndPassword(String user, String password){

        return instrumented(SignInTask.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(signIn_Button),
                Enter.theValue("exampleString").into(user_input),
                Click.on(signIn_Button),
                Enter.theValue("").into(user_input),
                Enter.theValue("exampleString").into(password_input),
                Click.on(signIn_Button),
                Enter.theValue(user).into(user_input),
                Enter.theValue(password).into(password_input),
                Click.on(signIn_Button),
                Click.on(Profile_button)
        );

    }
}

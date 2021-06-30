package co.com.choucair.certification.proyecto_cristianc.tasks;


import co.com.choucair.certification.proyecto_cristianc.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    public static Login onThePage(String strName, String strlastName, String strEmail, String strCity, String strZipcode, String strPassword, String strConfirm_password) {
        return Tasks.instrumented(Login.class);



    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("Cristian Camilo").into(ChoucairLoginPage.FIRST_NAME),
                Enter.theValue("Cuevas Castañeda").into(ChoucairLoginPage.LAST_NAME),
                Enter.theValue("cristianca84@romail.com").into(ChoucairLoginPage.E_MAIL),
                Click.on(ChoucairLoginPage.MONTH_BIRTH_DAY),
                Click.on(ChoucairLoginPage.DAY_BIRTH_DAY),
                Click.on(ChoucairLoginPage.YEAR_BIRTH_DAY),
                Click.on(ChoucairLoginPage.ENTER_BUTTON),
                Enter.theValue("Tunja").into(ChoucairLoginPage.CITY),
                Enter.theValue("150001").into(ChoucairLoginPage.ZIP_CODE),
                Click.on(ChoucairLoginPage.COUNTRY),
                Click.on(ChoucairLoginPage.ENTER_NEXTBUTTON),

                Click.on(ChoucairLoginPage.COMPUTER),
                Click.on(ChoucairLoginPage.VERSION),
                Click.on(ChoucairLoginPage.LANGUAGE),
                Click.on(ChoucairLoginPage.MOBILE),
                Click.on(ChoucairLoginPage.MODEL),
                Click.on(ChoucairLoginPage.SYSTEM),
                Click.on(ChoucairLoginPage.ENTER_LASTBUTTON),

                Enter.theValue("Casa1234$%&").into(ChoucairLoginPage.PASSWORD),
                Enter.theValue("Casa1234$%&").into(ChoucairLoginPage.CONFIRM_PASSWORD),
                Click.on(ChoucairLoginPage.STAY_INFORMED_BUTTON),
                Click.on(ChoucairLoginPage.HAVE_READ),
                Click.on(ChoucairLoginPage.READ_PRIVACY),
                Click.on(ChoucairLoginPage.COMPLETE_BUTTON)
        );

    }
}

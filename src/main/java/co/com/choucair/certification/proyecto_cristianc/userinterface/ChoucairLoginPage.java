package co.com.choucair.certification.proyecto_cristianc.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//*[contains(text(), 'Join Today')]"));
    public static final Target FIRST_NAME = Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target E_MAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target MONTH_BIRTH_DAY = Target.the("where do we write the month").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-12 col-md-6 col-lg-6 select2-theme-form']//*[contains(text(), 'June')]"));
    public static final Target DAY_BIRTH_DAY = Target.the("where do we write the day").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-12 col-md-6 col-lg-6 select2-theme-form']//*[contains(text(), '25')]"));
    public static final Target YEAR_BIRTH_DAY = Target.the("where do we write the year").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-12 col-md-6 col-lg-6 select2-theme-form']//*[contains(text(), '1984')]"));

    public static final Target ENTER_BUTTON = Target.the( "button to continue").located(By.xpath("//span[contains(text(), 'Next: Location')]"));


    public static final Target CITY = Target.the("where do we write the city").located(By.id("city"));
    public static final Target ZIP_CODE = Target.the("where do we write the zip code").located(By.id("zip"));
    public static final Target COUNTRY = Target.the("where do we write the country").located(By.xpath("//div[@class='form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12 select2-theme-form clear']//*[contains(text(), 'Colombia')]"));
    public static final Target ENTER_NEXTBUTTON = Target.the( "butTon to continue to next section").located(By.xpath("//span[contains(text(), 'Next: Devices')]"));

    public static final Target COMPUTER = Target.the("where do we write the computer").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//*[contains(text(), 'macOS')]"));
    public static final Target VERSION = Target.the("where do we write the version").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//*[contains(text(), 'Mojave 10.14.6')]"));
    public static final Target LANGUAGE = Target.the("where do we write the language").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//*[contains(text(), 'Language')]"));
    public static final Target MOBILE = Target.the("where do we write the mobile").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//*[contains(text(), 'Mobile')]"));
    public static final Target MODEL = Target.the("where do we write the model").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//*[contains(text(), 'Model')]"));
    public static final Target SYSTEM = Target.the("where do we write the system").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//*[contains(text(), 'System')]"));

    public static final Target ENTER_LASTBUTTON = Target.the( "butTon to continue to last section").located(By.xpath("//span[contains(text(), 'Next: Last Step')]"));
    public static final Target PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("where do we confirm the password").located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED_BUTTON = Target.the( "butTon to stay informed").located(By.xpath("//label[@class='input-check-box signup-consent signup-consent--highlight']//*[contains(text(), 'STAY INFORMED!')]"));
    public static final Target HAVE_READ = Target.the( "butTon to confirm I have read the term").located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target READ_PRIVACY = Target.the( "butTon to confirm i have read the privacy politics").located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target COMPLETE_BUTTON = Target.the( "butTon to confirm").located(By.xpath("//span[contains(text(), 'Complete Setup')]"));
}


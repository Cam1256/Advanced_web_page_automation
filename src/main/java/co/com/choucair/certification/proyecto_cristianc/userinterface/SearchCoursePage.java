package co.com.choucair.certification.proyecto_cristianc.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a class[contains(text(), 'Join Today')]"));
    public static final Target FIRST_NAME = Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target E_MAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target MONTH_BIRTH_DAY = Target.the("where do we write the month").located(By.id("birthMonth"));
    public static final Target DAY_BIRTH_DAY = Target.the("where do we write the day").located(By.id("birthDay"));
    public static final Target YEAR_BIRTH_DAY = Target.the("where do we write the year").located(By.id("birthYear"));

    public static final Target ENTER_BUTTON = Target.the( "button to confirm login").located(By.xpath("//span[contains(text(), 'Join Today')]"));

}


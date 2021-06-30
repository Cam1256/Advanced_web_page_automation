package co.com.choucair.certification.proyecto_cristianc.stepdefinitions;

import co.com.choucair.certification.proyecto_cristianc.model.AcademyChoucairData;
import co.com.choucair.certification.proyecto_cristianc.tasks.Login;
import co.com.choucair.certification.proyecto_cristianc.tasks.OpenUp;
import co.com.choucair.certification.proyecto_cristianc.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData ) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(academyChoucairData.get(0).getStrName(),academyChoucairData.get(0).getStrlastName(),academyChoucairData.get(0).getStrEmail(),academyChoucairData.get(0).getStrCity(),academyChoucairData.get(0).getStrZipcode(),academyChoucairData.get(0).getStrPassword(),academyChoucairData.get(0).getStrConfirm_password())));
    }

    @When("^he search for course (.*) on the choucair academy platform$")
    public void heSearchForCourseAdvancedLevelTestManagerOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }
}





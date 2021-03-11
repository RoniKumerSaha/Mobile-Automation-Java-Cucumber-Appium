package steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps extends TestSetup{
    @Given("^I open the application$")
    public void i_open_the_application(){
        System.out.println("App opened");
    }

    @Then("^I should see Home Page$")
    public void i_should_see_Home_Page(){
        System.out.println("I see home page");
    }

    @Given("^I click menu bar$")
    public void i_click_menu_bar(){
        new HomePage().clickMenu();
    }

    @Then("^I should see navigation drawer$")
    public void i_should_see_navigation_drawer(){
        Assert.assertTrue(new HomePage().navigationDrawerDisplayed());
    }

    @Given("^I am on length conversion page$")
    public void iAmOnLengthConversionPage() {
    }

    @When("^I enter input '(\\d+)'$")
    public void iEnterInput(String keyValue) {
        new HomePage().enterValue(keyValue);
    }

    @Then("^I should see result as '([^\"]*)'$")
    public void iShouldSeeResultAs(String result) {
        Assert.assertEquals(result, new HomePage().getResult());
    }

    @When("^I select the \"([^\"]*)\"$")
    public void iSelectThe(String type){
        new HomePage().selectConversionType(type);
    }

    @Then("^I should see conversion \"([^\"]*)\" selected$")
    public void iShouldSeeConversionSelected(String type){
        Assert.assertTrue(new HomePage().isTypeSelected(type));
    }
}

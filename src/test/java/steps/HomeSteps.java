package steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps extends TestSetup{
    @Given("^I open the application$")
    public void i_open_the_application(){
        new HomePage().clickMenu();
    }

    @Then("^I should see Home Page$")
    public void i_should_see_Home_Page(){
        Assert.assertTrue(new HomePage().navigationDrawerDisplayed());
    }
}

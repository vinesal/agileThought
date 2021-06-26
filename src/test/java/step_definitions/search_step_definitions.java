package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.AutomationPage;
import pages.Homepage;
import utilities.ConfigurationReader;
import utilities.Driver;



public class search_step_definitions {

    WebDriver driver = Driver.getDriver();
    Homepage hp = new Homepage(driver);
   AutomationPage up = new AutomationPage(driver);
  //Thread.sleep added to several methods for illustration purposes

    @Given("user is on the Agile Thought Homepage")
    public void user_is_on_the_agile_thought_homepage() throws InterruptedException {
        String URL = ConfigurationReader.getProperty("url");
        driver.get(URL);
        System.out.println("current URL: "+ driver.getCurrentUrl());
        Thread.sleep(1000);
    }

    @When("user clicks on Automation link")
    public void user_clicks_on_automation_link() throws InterruptedException {
    hp.AutomationLink();
    }

    @And("user scrolls down the page")
    public void userScrollsDownThePage() throws InterruptedException {
       up.scrolling(6);
    }

    @And("user fills in the required information")
    public void user_fills_in_the_required_information() throws InterruptedException {
       up.fillInfo();
    }

    @Then("user receives confirmation message")
    public void user_receives_confirmation_message() {
up.confirm();
    }



}

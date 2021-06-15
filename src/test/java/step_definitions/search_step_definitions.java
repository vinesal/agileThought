package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CareersPage;
import pages.Dominion;
import pages.DominionSDET;
import pages.Homepage;
import utilities.ConfigurationReader;
import utilities.Driver;



public class search_step_definitions {

     WebDriver driver = Driver.getDriver();
    Homepage hp = new Homepage(driver);
    CareersPage cp = new CareersPage(driver);
    Dominion dd = new Dominion(driver);
    DominionSDET ds = new DominionSDET(driver);
    @Given("user is on the Primestreet Homepage")
    public void user_is_on_the_primestreet_homepage() throws InterruptedException {
       String URL = ConfigurationReader.getProperty("url");
       driver.get(URL);
        System.out.println("current URL: "+ driver.getCurrentUrl());
        Thread.sleep(1000);
      String wh =  driver.getWindowHandle();
    }

    @When("user clicks on Careers link")
    public void user_clicks_on_careers_link() {
     hp.careerSearch();
        System.out.println("current url: " + driver.getCurrentUrl());}

    @When("user clicks on Available Jobs link")
    public void user_clicks_on_available_jobs_link() {
       cp.availJobs();
        System.out.println("url "+driver.getCurrentUrl());
    }

    @When("user clicks on SDET link")
    public void user_clicks_on_sdet_link() {
     dd.clickSDET(driver);

    }
    @When("user clicks on Apply link")
    public void user_clicks_on_apply_link() {
       ds.app();
    }
    @Then("user lands on the application page")
    public void user_lands_on_the_application_page() {
        System.out.println("current url: " + driver.getCurrentUrl());

    }
}

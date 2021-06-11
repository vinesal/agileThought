package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends Homepage  {
    public CareersPage (WebDriver driver) { super(driver); }
    @FindBy (xpath = "//*[contains(text(),'Available Jobs')]")
    WebElement jobs;
    public void availJobs(){
        jobs.click();
    }

}

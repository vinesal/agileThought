package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dominion extends Homepage {

    public Dominion(WebDriver driver) {
        super(driver);
    }
    @FindBy// (xpath = "//*[contains(text(), 'Software Development Engineer in Test (SDET)')]")
           // (xpath = "/html/body/div/div/div/div[1]/article/div/table/tbody/tr[1]/td[1]/a")
            (xpath = "a[@href = 'dominionenterprises/job/oUGuffw3']")
    WebElement sdet;

    public void clickSDET(){
        sdet.click();
    }
}

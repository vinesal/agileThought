package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dominion extends Homepage {

    public Dominion(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[contains(text(), 'Software Development Engineer in Test (SDET)')]")
    WebElement sdet;

    public void clickSDET(){
        sdet.click();
    }
}

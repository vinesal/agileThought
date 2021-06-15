package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Dominion extends Homepage {

    public Dominion(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[contains(text(), 'Software Development Engineer in Test (SDET)')]")
    WebElement sdet;

    public void clickSDET(WebDriver driver){
        Set<String> allWindowHandles = driver. getWindowHandles();
        System.out.println("window handles "+ allWindowHandles);
        List<String> wind = new ArrayList<String>(allWindowHandles);
        driver.switchTo().window(wind.get(1));
        System.out.println("url "+driver.getCurrentUrl());
        sdet.click();

    }
}

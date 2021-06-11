package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DominionSDET extends Homepage {

    public DominionSDET(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[contains(text(), 'Apply')]")
    WebElement apply;

    public void app(){
        apply.click();
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class Homepage {
@FindBy
        (xpath = "//*[contains( text(), 'Services')]")
        WebElement services;
@FindBy
         (xpath =" //*[contains( text(), 'Automation')]")

  WebElement Automation ;
public Homepage(WebDriver driver){
  PageFactory.initElements(Driver.getDriver(), this);
}

  public void AutomationLink () throws InterruptedException {
  services.click();
  Thread.sleep(2000);
  Automation.click();
  Thread.sleep(2000);
}

}

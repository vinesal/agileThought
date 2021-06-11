package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homepage {

@FindBy
         (xpath =" //a[@href = '/careers']")
      //  (xpath = "//*[contains(text(),'Careers')]")
  WebElement careers;
public Homepage(WebDriver driver){
  PageFactory.initElements(Driver.getDriver(), this);
}



  public void careerSearch (){
  careers.click();
}

}

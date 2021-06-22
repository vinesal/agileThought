package pages;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class AutomationPage extends Homepage {
  WebDriver driver = Driver.getDriver();
        public AutomationPage(WebDriver driver) {
            super(driver);
        }
        @FindBy(name = "firstname")
        WebElement firstName;
        @FindBy (name = "lastname")
        WebElement lastName;
        @FindBy (name = "email")
        WebElement email;
        @FindBy (name = "company")
        WebElement company;
        @FindBy (tagName = "textarea")
       // @FindBy (xpath = "//*[@id=\"description-84865226-adca-46da-a274-703f2a2c3c94\"]")
        WebElement helps;
    @FindBy (xpath = "//input[@type = 'submit']")
        WebElement submit;
        @FindBy (xpath = "//div[contains(text(),'Thank you for contacting us. We will be in touch')]")
        WebElement confirmMsg;


    public void scrolling(int i) throws InterruptedException {
        JavascriptExecutor Js1 = (JavascriptExecutor)driver;
        int j = 0;
        while (j<=i)
        { Js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        j++;}}

        public void fillInfo () throws InterruptedException {
        Actions action = new Actions(driver);
            firstName.sendKeys("Alex");
            Thread.sleep(2000);
            lastName.sendKeys("Smith");
            Thread.sleep(2000);
            email.sendKeys("alex@bayer.com");
            Thread.sleep(2000);
            company.sendKeys("self");
            Thread.sleep(2000);
            // help.click();
            helps.sendKeys("Testing");
            Thread.sleep(3000);
            scrolling(0);
            action.moveToElement(submit).perform();
            Thread.sleep(2000);
            submit.click();
            Thread.sleep(2000);
        }
        public void confirm(){
            String cm = confirmMsg.getText();
            Assert.assertEquals(cm, "Thank you for contacting us. We will be in touch with you shortly. If you have an immediate need please call us at 877-514-9180.");
            System.out.println("Confirmation message is "+cm);
        }



}

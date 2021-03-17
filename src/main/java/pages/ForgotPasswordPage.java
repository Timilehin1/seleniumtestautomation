package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By email = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){ this.driver = driver;}

    public void setEmail(String userEmail){
        driver.findElement(email).sendKeys(userEmail);
    }
    public SentEmailPage clickRetrieveButton(){
        driver.findElement(retrievePasswordButton).click();
        return new SentEmailPage(driver);
    }
}

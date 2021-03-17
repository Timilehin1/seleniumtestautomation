package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Create Fields
    private WebDriver driver;
    //private By authenticationForm = By.linkText("Form Authentication");
    private By forgotPasswordForm = By.linkText("Forgot Password");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        //driver.findElement(authenticationForm).click();
        clickLinks("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        clickLinks("Dropdown");
        return new DropDownPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(forgotPasswordForm).click();
        return new ForgotPasswordPage(driver);
    }
    private void clickLinks(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
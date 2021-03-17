package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

       WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
       shiftingContent.click();

       driver.findElement(By.linkText("Example 1: Menu Element")).click();
       System.out.println(driver.getTitle());

        List<WebElement> menuElements = driver.findElements(By.tagName("a"));
        System.out.println(menuElements.size());

        driver.quit();
    }

    public static void main(String[] args){
        Test test = new Test();
        test.setUp();
    }
}

package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TheInternet {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftContent = driver.findElement(By.linkText("Shifting Content"));
        shiftContent.click();

        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        System.out.println(driver.getTitle());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        driver.quit();
    }

    public static void main(String[] args){
        TheInternet theInternet = new TheInternet();
        theInternet.setUp();
    }
}

package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerTest {
    @Test
    public void verifyTable(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");
    }
}


// I made some committed today on March 23, 2022
// The Web opens successfully
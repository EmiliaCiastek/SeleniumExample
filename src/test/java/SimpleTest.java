import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

    @Test
    public void should_something(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\emcia\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://www.google.pl/");
        driver.get("http://orteil.dashnet.org/cookieclicker/");
        WebElement cookie = driver.findElement(By.id("bigCookie"));
        while (true) {
            cookie.click();
        }
//        WebElement cookies = driver.findElement(By.id("cookies"));
//        assertThat(cookies.getText()).contains("1");
    }
}

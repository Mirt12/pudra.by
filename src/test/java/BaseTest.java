import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest {

    @BeforeMethod
    public void WarmUp() {
    }

    @AfterMethod
    public void tearsDown() {
        DriverSingleton.quit();
    }
}
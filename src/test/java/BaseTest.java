
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void WarmUp() {
    }

    @AfterMethod
    public void tearsDown() {
        DriverSingleton.quit();
    }
}
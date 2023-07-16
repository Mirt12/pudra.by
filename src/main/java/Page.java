import org.openqa.selenium.WebDriver;

public class Page {
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    private String baseUrl = "https://pudra.by";
    public void getURL(){
        driver.get(baseUrl);
    }

    private String enterBtnLocator = "//div[@class='topbar-content']/a[@href='#modalSign']";

}

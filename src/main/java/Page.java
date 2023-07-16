import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
    private WebDriver driver;
    private String baseUrl = "https://pudra.by";
    private String enterBtnLocator = "//div[@class='topbar-content']/a[@href='#modalSign']";
    private String inputFieldEmailLocator = "//input[@name='emailSign']";


    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public Page getURL(){
        driver.get(baseUrl);
        return this;
    }

    public Page clickEnterBtn(){
        WebElement enterBtn = driver.findElement(By.xpath(enterBtnLocator));
        enterBtn.click();
        return this;
    }

    public Page fillEmailField(String email){
        WebElement emailFieldElement = driver.findElement(By.xpath(inputFieldEmailLocator));
        emailFieldElement.sendKeys(email);
        return this;
    }



}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {
    private WebDriver driver;
    private String baseUrl = "https://pudra.by";
    private String enterBtnLocator = "//div[@class='topbar-content']/a[@href='#modalSign']";
    private String inputFieldEmailLocator = "emailSign";
    private String inputFieldPwdLocator = "passwordSign";
    private String submitLoginFormBtnLocator = "//form[@id='formSign']//button[@type='submit']";
    private String errorMessageLocator = "//*[@id='formSign']//label[@class='error' and @style='display: block;']";

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public Page getURL() {
        driver.get(baseUrl);
        return this;
    }

    public Page clickEnterBtn() {
        WebElement enterBtn = driver.findElement(By.xpath(enterBtnLocator));
        enterBtn.click();
        return this;
    }

    public Page fillEmailField(String email) {
        WebElement emailFieldElement = driver.findElement(By.name(inputFieldEmailLocator));
        emailFieldElement.sendKeys(email);
        return this;
    }

    public Page fillPwdField(String password) {
        WebElement passwordFieldElement = driver.findElement(By.name(inputFieldPwdLocator));
        passwordFieldElement.sendKeys(password);
        return this;
    }

    public Page clickSubmitLoginFormBtn() {
        WebElement submitBtn = driver.findElement(By.xpath(submitLoginFormBtnLocator));
        submitBtn.click();
        return this;
    }

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(errorMessageLocator)));
        String errorMessageText = errorMessage.getText();
        return errorMessageText;
    }
}

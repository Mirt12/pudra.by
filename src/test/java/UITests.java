import org.testng.Assert;
import org.testng.annotations.Test;

public class UITests extends BaseTest {

    @Test
    public void testLoginWithIncorrectData() {
        Page page = new Page(driver);
        page.getURL().clickEnterBtn().fillEmailField("test@test.com").fillPwdField("password1").clickSubmitLoginFormBtn();
        Assert.assertEquals(page.getErrorMessage(), "Неверно указан E-mail или пароль");
    }
}
import org.apache.commons.lang3.BooleanUtils;
import org.example.DYSON.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestDyson extends TestInit {
    private DysonURL dysonURL;
    private DysonLogin dysonLogin;
    private DysonAccount dysonAccount;
    private CheckOut checkOut;
    private DysonLanguage dysonLanguage;
    private DysonFinding dysonFinding;

    private FindResult findResult;

    @BeforeMethod
    public void DysonURL() {
        dysonURL = new DysonURL(driver);
        dysonLogin = new DysonLogin(driver);
        dysonAccount = new DysonAccount(driver);
        dysonLanguage = new DysonLanguage(driver);
        checkOut = new CheckOut(driver);
        dysonFinding = new DysonFinding(driver);
        findResult = new FindResult(driver);
    }

    @Test
    public void testDyson() {
        dysonURL.goToHomePage()
                .moveToPilosos()
                .clickToBezdrotovi()
                .clickTov15()
                .clickToBuy()
                .clickToApply()
                .addName()
                .addPhone()
                .addCity()
                .addEmail();

        Assert.assertTrue(checkOut.myOrder().getText().contains("Ваше замовлення"));
    }

    @Test
    public void testLogin() {
        dysonURL.goToHomePage();
        dysonLogin.clickToLogin()
                .addEmail()
                .addPassword()
                .goToAccaunt()
                .goToPersonalDate();
        //   Assert.assertTrue(dysonAccount.textInAcc().isDisplayed());
        Assert.assertTrue(dysonAccount.textInAcc().getText().contains("Особисті дані"));
    }

    @Test
    public void testLanguage() {
        dysonURL.goToHomePage();
        assertThat(dysonLanguage.trueLang().getText()).as("Language incorrect").contains("Графік роботи");
        dysonLanguage.switchToRu();
        assertThat(dysonLanguage.trueLang().getText()).as("Language isn`t switched").contains("График работы");
    }

    @Test
    public void testFind() {
        dysonURL.goToHomePage();
        dysonFinding.addSearch();
        findResult.resultOfFind();

        Assert.assertTrue(findResult.resultOfFind().objectOfResult().isDisplayed());
    }
}


package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DysonLogin extends BasePage {
    public DysonLogin(WebDriver driver) {
        super(driver);
    }


    public WebElement login() {
        return findByXpath("//span[@class='userbar__button-text']");
    }



    public DysonLogin clickToLogin() {
        login().click();
        return this;
    }
    public WebElement emailForm() {
        return findByXpath("(//dd[@class='form-item']//input[@type='email'])[2]");
    }

    public DysonLogin addEmail() {
        emailForm().sendKeys("fandrey333@gmail.com");
        return this;
    }
    WebElement passwordForm() {
        return findByXpath("(//dd[@class='form-item']//input[@type='password'])[1]");
    }

    public DysonLogin addPassword() {
        passwordForm().sendKeys("moskard0744\n");
        sleep(5);
        return this;
    }


    WebElement myAccount() {
        return findByXpath("//span[@class='userbar__button-text']");
    }

    public DysonLogin goToAccaunt() {
        moveToElement(myAccount());
        sleep(3);
        return this;
    }


    public WebElement personalData() {
        return findByXpath("(//li[@class='userbar__menu-item']//a[@class='userbar__menu-link'])[1]");
    }
    public DysonAccount goToPersonalDate() {
        moveToElement(personalData());
        personalData().click();
        sleep(3);
        return new DysonAccount(driver);
    }

}
package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut extends BasePage {

    public CheckOut(WebDriver driver) {
        super(driver);
    }


    public WebElement formName() {
        return findByXpath("//input[@class='field'][@name='Recipient[delivery_name]']");
    }

    public CheckOut addName() {
        formName().sendKeys("Фісіненко Андрій Михайлович");
        return this;
    }


    public WebElement formNumber() {
        return findByXpath("//input[@name='Recipient[delivery_phone]']");
    }

    public CheckOut addPhone() {
        formNumber().sendKeys("634382939");
        return this;
    }


    public WebElement formCity() {
        return findByXpath("//input[@class='field j-ignore ui-autocomplete-input']");
    }

    public CheckOut addCity() {
        formCity().sendKeys("Київ");
        return this;
    }


    public WebElement formEmail() {
        return findByXpath("//input[@name='Recipient[delivery_email]']");
    }

    public CheckOut addEmail() {
        formEmail().sendKeys("fandrey333@gmail.com");
        return this;
    }

    public WebElement myOrder() {
        return findByXpath("//div[@class='order-header']");
    }
}





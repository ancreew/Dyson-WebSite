package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DysonV15 extends BasePage {
    public DysonV15(WebDriver driver) {
        super(driver);
    }
    public WebElement v15 () {
        return findByXpath("//span[@class='btn-content'][text()='Купити']");
    }
    public WebElement apply() {
        return findByXpath("//span[@class='btn-content'][text()='Оформити замовлення']");
    }

    public DysonV15 clickToBuy() {
        v15().click();
        return this;
    }

    public CheckOut clickToApply() {
        sleep(5);
        apply().click();
        return new CheckOut(driver);
    }
}

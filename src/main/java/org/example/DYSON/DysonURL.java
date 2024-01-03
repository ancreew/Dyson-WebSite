package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DysonURL extends BasePage {

    public DysonURL(WebDriver driver) {
        super(driver);
    }

    public DysonURL goToHomePage() {
        driver.get("https://dyson-service.com.ua/");
        return this;
    }
    public WebElement pilosos() {
        return findByXpath("(//div[@class='products-menu__title'])[2]");
    }

    public DysonURL moveToPilosos() {
        moveToElement(pilosos());
        return this;
    }
    public WebElement bezdrotovi() {
        return findByXpath("//span[@class='productsMenu-submenu-t'][text()='Бездротові']");
    }
    public Pilososi clickToBezdrotovi() {
        bezdrotovi().click();
        return new Pilososi(driver);
    }


}


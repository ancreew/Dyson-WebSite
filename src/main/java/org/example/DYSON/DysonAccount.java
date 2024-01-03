package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DysonAccount extends BasePage {
    public DysonAccount(WebDriver driver) {
        super(driver);
    }

   public WebElement textInAcc() {
        return findByXpath("//h1[@class='main-h']");
    }

}

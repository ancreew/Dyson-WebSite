package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pilososi extends BasePage {
    public Pilososi(WebDriver driver) {
        super(driver);
    }

    public WebElement tovar () {
        return findByXpath("(//div[@class='catalogCard-title'])[1]");
    }
    public DysonV15 clickTov15 () {
        tovar().click();
        return new DysonV15(driver);
    }

}

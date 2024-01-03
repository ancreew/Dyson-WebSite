package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindResult extends BasePage {

    public FindResult(WebDriver driver) {
        super(driver);
    }

    public FindResult resultOfFind() {
        driver.get("https://dyson-service.com.ua/katalog/search/?q=v15");
        return this;
    }

    public WebElement objectOfResult() {
        return findByXpath("(//img[@class='catalogCard-img'])[1]");
    }
}

package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DysonFinding extends BasePage{

    public DysonFinding(WebDriver driver) {
        super(driver);}

    public WebElement search() {
        return findByXpath("//input[@class='search__input']");
    }

    public FindResult addSearch () {
        search().sendKeys("V15");
        sleep(3);
        search().sendKeys("\n");
        sleep(3);
        return new FindResult(driver);
    }
}

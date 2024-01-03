package org.example.DYSON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DysonLanguage extends BasePage {

    public DysonLanguage(WebDriver driver) {
        super(driver);}

    public WebElement langChange(){
        return findByXpath("//a[@class='lang-menu__link']");
    }


    public DysonLanguage switchToRu() {
        langChange().click();
        sleep(3);
        return this;
    }

    public WebElement trueLang() {
        return findByXpath("//div[@class='timetable']");
    }

}

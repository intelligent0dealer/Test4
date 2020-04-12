package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ConfirmPage {
    private By confirmButton = By.cssSelector("[data-marker='item-edit-confirm/button-next']");
    private final WebDriver driver;

    public ConfirmPage(WebDriver driver) {
        this.driver = driver;
    }

    public InfoForm confirmButtonClick() {
        driver.findElement(confirmButton).click();
        return new InfoForm(this.driver);
    }

    public boolean atPage(String data) {
        if (driver.getTitle().equals(data)) {
            return true;
        } else {
            return false;
        }

    }
}

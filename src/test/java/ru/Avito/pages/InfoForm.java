package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoForm {
    private By nameField = By.id("title");
    // private By categoryButton =
    private By descriptionField = By.id("description");
    private By priceField = By.id("Price");
    private WebElement uploadButton;
    private By continueButton = By.cssSelector("[data-marker='item-edit/button-next']");

    public InfoForm(WebDriver driver, By selector) {
        var formElement = driver.findElement(selector);
        {
            uploadButton = formElement.findElement(By.cssSelector("[data-marker='add']"));
        }

    }
}


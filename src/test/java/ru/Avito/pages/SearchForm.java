package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForm {
    private final WebElement input;
    private final WebElement searchButton;

    public SearchForm(WebDriver driver, By selector) {
        var formElement = driver.findElement(selector);
        input = formElement.findElement(By.cssSelector("[data-marker='search-form/suggest']"));
        searchButton = formElement.findElement(By.cssSelector("[data-marker='search-form/submit-button']"));
    }

    public void search(String what) {
        this.input.sendKeys(what);
        this.searchButton.click();
    }
}

package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryField {
    private final WebDriver driver;
    private final WebElement element;

    public CategoryField(WebDriver driver, By selector) {
        this.driver = driver;
        this.element = driver.findElement(selector);
    }
    public void categoryButton() {

    }

}

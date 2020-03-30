package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPanel {
    private final WebDriver driver;
    private final WebElement element;

    public HeaderPanel(WebDriver driver, By selector) {
        this.driver = driver;
        this.element = driver.findElement(selector);
    }

    public LoginForm openLoginForm() {
        var loginButton = this.element.findElement(By.cssSelector("[data-marker='header/login-button']"));
        loginButton.click();
        return new LoginForm(this.driver, By.cssSelector("[data-marker='login-form']"));
    }

}


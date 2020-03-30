package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {
    private final WebElement loginInput;
    private final WebElement passwordInput;
    private final WebElement submitButton;

    public LoginForm(WebDriver driver, By selector) {
        var formElement = driver.findElement(selector);
        loginInput = formElement.findElement(By.cssSelector("[data-marker='login-form/login']"));
        passwordInput = formElement.findElement(By.cssSelector("[data-marker='login-form/password']"));
        submitButton = formElement.findElement(By.cssSelector("[data-marker='login-form/submit']"));
    }

    public void login(String login, String password) {
        this.loginInput.sendKeys(login);
        this.passwordInput.sendKeys(password);
        this.submitButton.click();
    }
}

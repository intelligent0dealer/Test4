package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {
    private  WebDriver driver;
    private  By loginField = By.name("login");
    private  By passField = By.name("password");
    private  By submitButton = By.name("submit");

    public LoginForm(WebDriver driver) {
        this.driver = driver;
    }

    public void inputAuth (String login, String password) {
        input(loginField, login);
        input(passField, password);
    }

    private void input(By control, String data) {
        driver.findElement(control).sendKeys(data);
    }

    public void submit() {
        driver.findElement(submitButton).click();
    }

    public boolean atPage(String data) {
        if (driver.getTitle().equals(data)) {
            return true;
        } else {
            return false;
        }
    }

}
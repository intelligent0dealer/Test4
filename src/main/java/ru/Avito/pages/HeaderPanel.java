package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPanel {
    private final WebDriver driver;
    private By avatar= By.cssSelector("header-services-menu-avatar-QlGRi");

    public boolean avatarIsAvailable(){
      return driver.findElements(avatar).size() == 0;
    }
    public HeaderPanel(WebDriver driver) {
        this.driver = driver;
    }

    public LoginForm openLoginForm() {
        var loginButton = driver.findElement(By.cssSelector("[data-marker='header/login-button']"));
        loginButton.click();
        return new LoginForm(this.driver);
    }

}


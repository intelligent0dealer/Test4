package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.*;

public class InfoForm {
    private  WebDriver driver;
    private By nameField = By.id("title");
    private By categoryButton = new By.ByXPath
            ("//*[contains(@data-marker, 'category-wizard/button')][contains(text(),'Животные')]");
    private By submitCatButton= new By.ByXPath
        ( "//button/span[contains(text(), 'Товары для животных / Животные')]");
    private By descriptionField = By.id("description");
    private By priceField = By.id("Price");
    private By uploadButton = By.cssSelector("[data-marker='add']");
    private By continueButton = By.cssSelector("[data-marker='item-edit/button-next']");

    public InfoForm(WebDriver driver) {
        this.driver = driver;
    }

    public void categoryClick() {
        click(categoryButton);
    }

    public void inputName (String name) {
        input(nameField, name);
    }

    public void submitClick() {
        click(submitCatButton);
    }

    public void inputDescriptPrice(String description, String price) {
        input(descriptionField, description);
        input(priceField, price);
    }

    public void uploadPhoto() {
        WebElement fileInput = driver.findElement(By.id("uploadFile"));
        fileInput.sendKeys("/path/to/file.jpg");
    }

    public void continueClick() {
        click(continueButton);
    }

    public boolean atPage(String data) {
        if (driver.getTitle().equals(data)) {
            return true;
        } else {
            return false;
        }
    }

    private void input(By control, String data) {
        driver.findElement(control).sendKeys(data);
    }
    private void click(By control) {
        driver.findElement(control).click();
    }
}





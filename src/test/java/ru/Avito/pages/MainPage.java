package ru.Avito.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    public final HeaderPanel Header;
    public final SearchForm Search;


    public MainPage(WebDriver driver) {
        Header = new HeaderPanel(driver, By.cssSelector("[data-marker='header/navbar']"));
        Search = new SearchForm(driver, By.cssSelector("[data-marker='search-form']"));
    }
}


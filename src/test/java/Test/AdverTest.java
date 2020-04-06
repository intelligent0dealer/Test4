package Test;

import config.SeleniumConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.Avito.pages.ConfirmPage;
import ru.Avito.pages.HeaderPanel;
import ru.Avito.pages.InfoForm;
import ru.Avito.pages.LoginForm;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class AdverTest {
    private SeleniumConfig config;
    private WebDriver driver;
    private LoginForm loginForm;
    private InfoForm infoForm;
    private ConfirmPage confirmPage;


    @Before
    public void setUp() {
        config = new SeleniumConfig();
        driver = config.getDriver();
        config.open("https://www.avito.ru/additem");
        loginForm = new LoginForm(driver);
        infoForm = new InfoForm(driver);
        confirmPage = new ConfirmPage(driver);
    }

    @Test
    public void createAdver() throws InterruptedException {
        LoginForm loginForm = new LoginForm(driver);
        InfoForm infoForm = new InfoForm(driver);
        ConfirmPage confirmPage = new ConfirmPage(driver);
        loginForm.inputAuth("login", "password"); // существующие и верные данные
        loginForm.submit();
        // капча
        infoForm.atPage("Новое объявление"); // после входа нас кидает на страницу с созданием объявления
        infoForm.categoryClick();
        infoForm.inputName("Поводок-рулетка");
        infoForm.submitClick();
        infoForm.inputDescriptPrice("Для собак","10000");
        infoForm.uploadPhoto();
        infoForm.continueClick();
        confirmPage.confirmButtonClick();
        confirmPage.atPage("Для активации, пожалуйста, оплатите разовое размещение.");

    }

    @After
    public void afterTest(){
        driver.quit();
    }
}
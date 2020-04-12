package Test;

import config.SeleniumConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.Avito.pages.ConfirmPage;
import ru.Avito.pages.InfoForm;
import ru.Avito.pages.LoginForm;


public class AdverTest {
    private SeleniumConfig config;
    private WebDriver driver;

    @Before
    public void setUp() {
        config = new SeleniumConfig();
        driver = config.getDriver();
        config.open("https://www.avito.ru/additem");
    }

    @Test
    public void createAdver() {
        LoginForm loginForm = new LoginForm(driver);
        InfoForm infoForm = new InfoForm(driver);
        ConfirmPage confirmPage = new ConfirmPage(driver);
        loginForm.inputAuth("login", "password"); // существующие и верные данные
        loginForm.submit();
        // капча
        Assert.assertTrue(avatarIsAvailable); // проверка наличия элемента аватарки юзера
        infoForm.atPage("Новое объявление"); // после входа нас кидает на страницу с созданием объявления
        infoForm.categoryClick();
        infoForm.inputName("Поводок-рулетка");
        infoForm.submitClick();
        infoForm.inputDescriptPrice("Для собак","10000");
        infoForm.uploadPhoto();
        infoForm.continueClick();
        confirmPage.confirmButtonClick();
        Assert.assertEquals(driver.getTitle(), "Для активации, пожалуйста, оплатите разовое размещение.");

    }

    @After
    public void afterTest(){
        driver.quit();
    }
}
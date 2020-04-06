package Test;

import config.SeleniumConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.Avito.pages.HeaderPanel;
import ru.Avito.pages.LoginForm;

public class LoginTest {
    private SeleniumConfig config;
    private WebDriver driver;
    private HeaderPanel headerPanel;
    private LoginForm loginForm;

    @Before
        public void setUp() {
            config = new SeleniumConfig();
            driver = config.getDriver();
            config.open("http://avito.ru");
            loginForm = new LoginForm(driver);
            headerPanel = new HeaderPanel(driver);
        }

    @Test
        public void inCorrectLogin() {
            HeaderPanel header = new HeaderPanel(driver);
            LoginForm loginForm = header.openLoginForm();
            loginForm.inputAuth("123", "456"); // заведомо неверный формат логина
            loginForm.submit();
            // Вылазит капча
            // Капча пройдена
            loginForm.atPage("Некорректный номер телефона");
        }
    @Test
        public void correctLogin() {
            HeaderPanel header = new HeaderPanel(driver);
            LoginForm loginForm = header.openLoginForm();
            loginForm.inputAuth("login", "password"); // существующие и верные данные
            loginForm.submit();
            // капча
            loginForm.atPage("success"); // проверка успешного входа
        }

    @After
        public void afterTest(){
            driver.quit();
    }
    }
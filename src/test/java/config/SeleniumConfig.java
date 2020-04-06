package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SeleniumConfig {
    static {
    String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "//driver/chromedriver.exe");
    }

    private WebDriver driver;

    public SeleniumConfig() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void open(String page) {
        driver.get(page);
    }

    public WebDriver getDriver(){
        return driver;
    }
}

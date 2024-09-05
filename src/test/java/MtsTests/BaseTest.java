package MtsTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected MtsHomePageAdd mtsHomePageAdd;

    @BeforeEach
    public void setUp() {
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        mtsHomePageAdd = new MtsHomePageAdd(driver);
        mtsHomePageAdd.acceptCookiesIfPresent();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSingleton.getInstance().quitDriver();
    }
}

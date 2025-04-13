package Pages;

import Base.BaseTests;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTests {

    @Step("Hesap bilgii kontrol edilir")
    public MainPage accountControl() {
        String text = driver.findElement(By.cssSelector("[class='account-link headerButon']")).getText();
        Assert.assertEquals(text, "");
        screenshot();
        return this;
    }
}

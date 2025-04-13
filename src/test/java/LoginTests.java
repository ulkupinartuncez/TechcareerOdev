import Base.BaseTests;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static java.sql.DriverManager.getDriver;
import static org.openqa.selenium.devtools.v132.page.Page.captureScreenshot;

public class LoginTests extends BaseTests {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage= new MainPage();

    @Test(description = "basarili kullanici girisi")
    public void basariligiris() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        sleep(3000);
        mainPage.accountControl();
    }

    @Test(description = "basarisiz kullanici girisi")
    public void basarisizgiris() throws InterruptedException {

        loginPage.fillEmail(email)
                .fillPassword("admin123")
                .clickLogin();
        sleep(3000);

        //Hatalı kullanıcı adı veya şifre, lütfen tekrar deneyiniz! uyarıyı site vermesine rağmen bir süre sonra bu uyarı kapanıyor bu yüzden failed oluyor.
        loginPage.errorMessageControl("Hatalı kullanıcı adı veya şifre, lütfen tekrar deneyiniz!");

    }

}

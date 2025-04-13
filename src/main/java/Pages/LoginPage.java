package Pages;

import Base.BaseTests;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTests {

    @Step("E-posta alani doldurulur")
    //Kullandığım web sitesi kaynaklı uygulayamadım passed test failed teste dönüştü.E-mail ve şifre girilmedi.
    public LoginPage fillEmail (String email){
        driver.findElement(By.id("txtUyeGirisEmail")).sendKeys(email);
        return this;
    }
    @Step("Sifre alani doldurulur")
    public LoginPage fillPassword(String password){
        driver.findElements(By.name("txtUyeGirisPassword")).get(0).sendKeys(password);
        return this;
    }
    @Step("Login alanina tiklanir")
    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[class='newUserLoginBtn newButton']")).click();
        return this;
    }
    @Step("Hata mesaji kontrol edilir")
    public LoginPage errorMessageControl(String value){
        String text = driver.findElement(By.cssSelector("[class='ticimaxDialogTxt ticimaxDialog-warning']")).getText();
        Assert.assertEquals(text,value);
        screenshot();
        return this;
    }
}

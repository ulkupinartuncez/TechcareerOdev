package Pages;

import Base.BaseTests;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTests {

    @Step("E-posta alani doldurulur")
<<<<<<< HEAD
=======
    
>>>>>>> 8adf087aec7883fce80755db2dd1b5f83af87546
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

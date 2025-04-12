import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void basariligiris() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.schafer.com.tr/UyeGiris");
        driver.findElement(By.id("txtUyeGirisEmail")).sendKeys(email);
        driver.findElements(By.name("txtUyeGirisPassword")).get(0).sendKeys(password);
        driver.findElement(By.cssSelector("[class='newUserLoginBtn newButton']")).click();
        Thread.sleep(3000);
        WebElement hesapSimgesi = driver.findElement(By.cssSelector("[class='svgIcon cart-svg']"));
        String text= driver.findElements(By.cssSelector("[class='account-link headerButon']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text,"");

    }
    @Test
    public void basarisizgiris() throws InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.schafer.com.tr/UyeGiris");
        driver.findElement(By.id("txtUyeGirisEmail")).sendKeys(email);
        driver.findElements(By.name("txtUyeGirisPassword")).get(0).sendKeys("admin297.");
        driver.findElement(By.cssSelector("[class='newUserLoginBtn newButton']")).click();
        Thread.sleep(2000);
        WebElement hesapSimgesi = driver.findElement(By.cssSelector("[class='svgIcon cart-svg']"));
        String text= driver.findElement(By.cssSelector("[class='ticimaxDialogTxt ticimaxDialog-warning']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Hatalı kullanıcı adı veya şifre, lütfen tekrar deneyiniz!");
        //Hatalı kullanıcı adı veya şifre, lütfen tekrar deneyiniz! uyarıyı site veriyor ama bir süre sonra bu uyarı kapanıyor bu yüzden failed oluyor.

    }
}

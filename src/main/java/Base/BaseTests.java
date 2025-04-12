package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests extends Data {
    public WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
//        WebDriver driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.schafer.com.tr/UyeGiris");
        // Siteden kaynaklandığını düşündüğüm için bu kısmı iptal ettim başarılı olan testi başarısız gösteriyordu.
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}

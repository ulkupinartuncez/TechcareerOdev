package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests extends BaseLibrary {


    @BeforeMethod
    public void openBrowser(){
     driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.schafer.com.tr/UyeGiris");

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            // Test başarısız olursa ekran görüntüsü al
            screenshot();
        }

        driver.quit();
    }
}

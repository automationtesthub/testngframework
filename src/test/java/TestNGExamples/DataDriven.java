package TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataDriven {

    public WebDriver driver;

    @Test(dataProvider = "testdata")
    public void login(String uid,String pwd)
    {
        driver.findElement(By.name("user_name")).clear();
        driver.findElement(By.name("user_name")).sendKeys(uid);
        driver.findElement(By.name("user_password")).sendKeys(pwd);
        driver.findElement(By.name("Login")).click();
    }

    @DataProvider
    public Object[][] testdata() {
        return new Object[][] {
                { "admin1", "pwd1" },
                { "admin2", "pwd2" },
                { "admin3", "pwd3" }
        };
    }



    @BeforeClass
    public  void launchapp()
    {
        driver = new ChromeDriver();
        driver.get("http://localhost:100");
    }

    @AfterClass
    public  void closeApp()
    {
        driver.quit();
    }
}

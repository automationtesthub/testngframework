package TestNGExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsExample {

    public static WebDriver driver;

    @Test(priority = 0)
    public void xyz()
    {
        driver.findElement(By.linkText("New Lead")).click();
        driver.findElement(By.name("lastname")).sendKeys("Modi");
        driver.findElement(By.name("company")).sendKeys("BJP");
        driver.findElement(By.name("button")).click();
        Assert.assertEquals(true,driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[text()='Modi']")).isDisplayed());
        Assert.assertEquals("BJP",driver.findElement(By.xpath("//td[text()='Company:']/following::td[text()='BJP']")).getText());

    }


    @Test(priority = 1)
    public void abc()
    {
        driver.findElement(By.linkText("New Account")).click();
        driver.findElement(By.name("accountname")).sendKeys("ACC");
        driver.findElement(By.name("button")).click();
        Assert.assertEquals("ACC2",driver.findElement(By.xpath("//td[text()='Account Name:']/following::td[text()='ACC']")).getText());
    }

    @BeforeMethod
    public void login()
    {
        driver.findElement(By.name("user_name")).clear();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
    }

    @AfterMethod
    public void logout()
    {
       driver.findElement(By.linkText("Logout")).click();
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

    @BeforeTest
    public void beforetest()
    {
        System.out.println("beforetest");
    }

    @AfterTest
    public void aftertest()
    {
        System.out.println("aftertest");
    }

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("beforesuite");
    }

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("aftersuite");
    }
}

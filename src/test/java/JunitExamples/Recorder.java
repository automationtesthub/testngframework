package JunitExamples;


import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class Recorder {
    private WebDriver driver;
    
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;
    @Before
    public void setUp() throws Exception {

        driver = new ChromeDriver();
        driver.get("http://localhost:100/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void testLeadE2E() throws Exception {

        try {
            assertEquals("vtiger CRM - Commercial Open Source CRM", driver.getTitle());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        isElementPresent(By.xpath("//td[2]/img"));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=':: Sales Force Automation'])[1]/preceding::h4[1]")).click();
        try {
            assertEquals("Key Modules", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=':: Sales Force Automation'])[1]/preceding::font[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("vtiger Customer Portal", driver.findElement(By.linkText("vtiger Customer Portal")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//td[2]/table")).click();
        driver.findElement(By.name("user_name")).clear();
        driver.findElement(By.name("user_name")).sendKeys("dsgsdg");
        driver.findElement(By.name("user_password")).click();
        driver.findElement(By.name("user_password")).clear();
        driver.findElement(By.name("user_password")).sendKeys("sgdgs");
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='vtiger Thunderbird Extension'])[1]/following::td[2]")).click();
        isElementPresent(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='vtiger Thunderbird Extension'])[1]/following::td[2]"));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='User Log-in'])[1]/following::td[2]")).click();
        driver.findElement(By.xpath("//td[2]/table/tbody/tr")).click();
        driver.findElement(By.name("user_name")).clear();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).clear();
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("login_theme")).click();
        new Select(driver.findElement(By.name("login_theme"))).selectByVisibleText("nature");
        driver.findElement(By.name("Login")).click();
        try {
            assertEquals("Home", driver.findElement(By.linkText("Home")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Logout", driver.findElement(By.linkText("Logout")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("New Lead")).click();
        driver.findElement(By.name("button")).click();
        assertEquals("Last Name cannot be empty", closeAlertAndGetItsText());
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Modi");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Help'])[2]/following::div[3]")).click();
        driver.findElement(By.name("button")).click();
        assertEquals("Company cannot be empty", closeAlertAndGetItsText());
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("BJP");
        driver.findElement(By.name("EditView")).click();
        driver.findElement(By.name("button")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last Name:'])[1]/following::td[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last Name:'])[1]/following::td[1]")).click();
        try {
            assertEquals("Modi", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last Name:'])[1]/following::td[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Company:'])[1]/following::td[1]")).click();
        try {
            assertEquals("BJP", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Company:'])[1]/following::td[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.name("Edit")).click();
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Modi1");
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("BJP1");
        driver.findElement(By.name("button")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last Name:'])[1]/following::td[1]")).click();
        try {
            assertEquals("Modi1", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last Name:'])[1]/following::td[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Company:'])[1]/following::td[1]")).click();
        try {
            assertEquals("BJP1", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Company:'])[1]/following::td[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.xpath("//table[3]/tbody/tr/td/table/tbody/tr/td[4]/input")).click();
        driver.findElement(By.xpath("//table[3]/tbody/tr/td/table/tbody/tr/td[4]/input")).clear();
        driver.findElement(By.xpath("//table[3]/tbody/tr/td/table/tbody/tr/td[4]/input")).sendKeys("Modi1");
        driver.findElement(By.xpath("//td[6]/input")).click();
        driver.findElement(By.xpath("//td[6]/input")).click();
        driver.findElement(By.xpath("//td[6]/input")).clear();
        driver.findElement(By.xpath("//td[6]/input")).sendKeys("BJP1");
        driver.findElement(By.xpath("//td[7]/input[7]")).click();
        driver.findElement(By.name("selected_id")).click();
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        driver.findElement(By.xpath("//table[3]/tbody/tr/td/table/tbody/tr/td[4]/input")).click();
        driver.findElement(By.xpath("//table[3]/tbody/tr/td/table/tbody/tr/td[4]/input")).clear();
        driver.findElement(By.xpath("//table[3]/tbody/tr/td/table/tbody/tr/td[4]/input")).sendKeys("Modi1");
        driver.findElement(By.xpath("//td[6]/input")).click();
        driver.findElement(By.xpath("//td[6]/input")).click();
        driver.findElement(By.xpath("//td[6]/input")).clear();
        driver.findElement(By.xpath("//td[6]/input")).sendKeys("BJP1");
        driver.findElement(By.xpath("//td[7]/input[7]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create View'])[1]/following::td[3]")).click();
        try {
            assertEquals("Showing 0 - 0 of 0", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create View'])[1]/following::td[3]")).getText().trim());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New Invoice'])[1]/following::td[1]")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}


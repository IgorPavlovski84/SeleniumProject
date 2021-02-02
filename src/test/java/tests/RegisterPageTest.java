package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegisterNewUserPage;
import pages.RegisterPage;

import java.util.concurrent.TimeUnit;


public class RegisterPageTest {

    String pageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    WebDriver driver;

    RegisterPage regPage;

    RegisterNewUserPage newUser;

    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe" );

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(pageURL);

    }

    @Test(priority=0)
    public void testEnterEmailAndCreateNewUser(){

        //Create registration Page object
        regPage = new RegisterPage(this.driver);

        //Enter a new email and click to create an account
        regPage.enterEmailToCreateNewUser("newemail@domain.com");

        Assert.assertEquals("Login - My Store", driver.getTitle());
    }

    @Test(priority=1)
    public void testRegisterNewUserPage () {

        //Create RegisterNewUserPage object
        newUser = new RegisterNewUserPage(this.driver);

        //Check the Mrs radio button for Title option
        newUser.setTitleAsMrs();

        boolean mrsFlag = driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).isSelected();

        //Check if the Mrs radio is selected
        Assert.assertTrue(mrsFlag);
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }





}
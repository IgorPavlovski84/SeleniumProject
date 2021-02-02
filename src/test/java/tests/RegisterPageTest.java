package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegisterPage;

import java.util.concurrent.TimeUnit;


public class RegisterPageTest {

    String driverPath = "";

    WebDriver driver;

    RegisterPage regPage;

    @BeforeTest

    public void setup(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe" );

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }

    @Test(priority=0)

    public void testEnterEmailToCreateNewUser(){

        //Create registration Page object

        regPage = new RegisterPage(driver);

        regPage.enterEmailToCreateNewUser("newemail@domain.com");



        Assert.assertEquals("Login - My Store", driver.getTitle());

        //Verify login page title

        //String loginPageTitle = objLogin.getLoginTitle();

        //Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

        //login to application

        //objLogin.loginToGuru99("mgr123", "mgr!23");

        // go the next page

        //objHomePage = new Guru99HomePage(driver);

        //Verify home page

        //Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }



}
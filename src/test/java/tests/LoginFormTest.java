package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInSignUpPage;

import java.util.concurrent.TimeUnit;

public class LoginFormTest {
    String pageURL = "http://automationpractice.com/index.php";

    WebDriver driver;

    SignInSignUpPage regPage;
    HomePage homePage;

    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe" );

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(pageURL);

        homePage = new HomePage(this.driver);
        homePage.clickToSignIn();

    }

    @Test(priority=1)
    public void testUserLoginWithValidInformationIsSuccessful() {

        regPage = new SignInSignUpPage(this.driver);
        regPage.enterEmail("newemail2@domain.com");
        regPage.enterPassword("5char");
        regPage.signIn();

        String resultURl = driver.getCurrentUrl();

        Assert.assertEquals(resultURl,"http://automationpractice.com/index.php?controller=my-account");

        regPage.signOut();
    }

    @Test(priority=2)
    public void testUserLoginWithValidInformationIsNotSuccessful() {

        regPage = new SignInSignUpPage(this.driver);
        regPage.enterEmail("newemail2@domain.com");
        regPage.enterPassword("5char&someMore");
        regPage.signIn();

        String errorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();

        Assert.assertEquals(errorMessage,"There is 1 error\n" + "Authentication failed.");

        regPage.signOut();
    }

    @Test(priority=3)
    public void testUserForgotPassword() {

        regPage = new SignInSignUpPage(this.driver);
        regPage.forgotPassword();
        String password = "newemail2@domain.com";

        By retrievePasswordField = By.xpath("//*[@id=\"email\"]");
        driver.findElement(retrievePasswordField).sendKeys(password + Keys.ENTER);

        String confMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
        Assert.assertEquals(confMessage, "A confirmation email has been sent to your address: " + password);


    }



    @AfterClass
    public void closeDriver() {
        driver.quit();
    }

}

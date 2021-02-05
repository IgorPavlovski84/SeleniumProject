package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterNewUserPage;
import pages.SignInSignUpPage;

import java.util.concurrent.TimeUnit;


public class RegisterNewUserPageTest {

    String pageURL = "http://automationpractice.com/index.php";

    WebDriver driver;

    SignInSignUpPage regPage;
    RegisterNewUserPage newUser;
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

    @Test(priority=0)
    public void testEnterEmailToCreateNewUser(){

        //Create registration Page object
        regPage = new SignInSignUpPage(this.driver);

        //Enter a new email and click to create an account
        regPage.enterEmailToCreateNewUser("newemail5@domain.com");


        Assert.assertEquals("Login - My Store", driver.getTitle());
    }

    @Test(priority=1)
    public void testRegisterNewUser () {

        newUser = new RegisterNewUserPage(this.driver);
        newUser.setTitleAsMr();
        newUser.setFirstName("MyName");
        newUser.setLastName("MyLastName");
        newUser.setPassword("5char");
        newUser.setBirthDay("15");
        newUser.setBirthMonth("11");
        newUser.setBirthYear("1991");
        newUser.setNewsletter();
        newUser.setOffers();
        newUser.setCompany(" My Company Name");
        newUser.setAddress1("Main Street 123");
        newUser.setAddress2("Additional address info");
        newUser.setCity("My City");
        newUser.setCountry("21");
        newUser.setState("50");
        newUser.setPostalCode("56445");
        newUser.setAdditionalInfo("Some additional info to be added");
        newUser.setHomePhone("004915125752526");
        newUser.setMobilePhone("004915125752527");
        newUser.setAddressAlias("Alias for the address");
        newUser.registerNewUser();

        String userName = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals("MyName MyLastName", userName);

    }



    @AfterClass
    public void closeDriver() {
        driver.quit();
    }



// TODO IGOR

}
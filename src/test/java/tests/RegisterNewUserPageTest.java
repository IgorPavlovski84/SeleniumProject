package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.RegisterNewUserPage;
import pages.NavigateToRegisterPage;

import java.util.concurrent.TimeUnit;


public class RegisterNewUserPageTest {

    String pageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    WebDriver driver;

    NavigateToRegisterPage regPage;

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
        regPage = new NavigateToRegisterPage(this.driver);

        //Enter a new email and click to create an account
        regPage.enterEmailToCreateNewUser("newemail@domain.com");

        Assert.assertEquals("Login - My Store", driver.getTitle());
    }

    @Test(priority=1)
    public void testRegisterNewUserPage () {

        //Create RegisterNewUserPage object
        newUser = new RegisterNewUserPage(this.driver);

        //Check the Mrs radio button for Title option
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



        String emailEntered = driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value");
        Assert.assertEquals("newemail@domain.com", emailEntered);

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException ignored){
        }

        boolean mrsFlag = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).isSelected();

        //Check if the Mrs radio is selected
        Assert.assertTrue(mrsFlag);
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }





}
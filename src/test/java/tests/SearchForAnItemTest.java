package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class SearchForAnItemTest {

    String pageURL = "http://automationpractice.com/index.php";

    WebDriver driver;

    HomePage homePage;

    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe" );

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(pageURL);

        homePage = new HomePage(this.driver);

    }

    @Test
    public void testNumberOfSearchResults() {

        homePage.enterTermToSearch("summer");

        String searchResult = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]/div[2]")).getText();

        Assert.assertEquals("Showing 1 - 4 of 4 items", searchResult);
    }

    @Test public void testSearchTerm() {

        homePage.enterTermToSearch("some Term");

        String searchTerm = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();

        Assert.assertEquals("No results were found for your search \"some Term\"", searchTerm);
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}

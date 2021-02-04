package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NavigateToRegisterPage {

    WebDriver driver;

    By emailField = By.xpath("//*[@id=\"email_create\"]");


    public NavigateToRegisterPage(WebDriver driver){
        this.driver = driver;
    }

    //Enter email to create an new user
    public void enterEmailToCreateNewUser(String newEmail){

        driver.findElement(emailField).sendKeys(newEmail + Keys.ENTER);

    }

}
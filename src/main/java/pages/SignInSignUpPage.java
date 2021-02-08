package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignInSignUpPage {

    WebDriver driver;


    public SignInSignUpPage(WebDriver driver){
        this.driver = driver;
    }


    //Enter email to create a new user
    By emailField = By.xpath("//*[@id=\"email_create\"]");
    public void enterEmailToCreateNewUser(String newEmail){
        driver.findElement(emailField).sendKeys(newEmail + Keys.ENTER);
    }

    By emailBy = By.xpath("//*[@id=\"email\"]");
    public void enterEmail(String email) {
        driver.findElement(emailBy).sendKeys(email);
    }

    By password = By.xpath("//*[@id=\"passwd\"]");
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    By signIn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    public void signIn() {
        driver.findElement(signIn).click();
    }

    By forgotPass = By.xpath("//*[@id=\"login_form\"]/div/p[1]/a");
    public void forgotPassword() {
        driver.findElement(forgotPass).click();
    }

    By signOut = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");
    public void signOut() {
        driver.findElement(signOut).click();
    }



}
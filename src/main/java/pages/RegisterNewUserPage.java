package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterNewUserPage {

    WebDriver driver;

    public RegisterNewUserPage(WebDriver driver){
        this.driver = driver;
    }

    By titleRadioMr = By.xpath("//*[@id=\"id_gender1\"]");
    public void setTitleAsMr() {
        driver.findElement(titleRadioMr).click();
    }

    By titleRadioMrs = By.xpath("//*[@id=\"id_gender2\"]");
    public void setTitleAsMrs() {
        driver.findElement(titleRadioMrs).click();
    }

    By firstNameX  = By.xpath("//*[@id=\"customer_firstname\"]");
    public void setFirstName(String firstName) {
        driver.findElement(firstNameX).sendKeys(firstName);
    }

    By lastNameX  = By.xpath("//*[@id=\"customer_lastname\"]");
    public void setLastName(String lastName) {
        driver.findElement(lastNameX).sendKeys(lastName);
    }



}

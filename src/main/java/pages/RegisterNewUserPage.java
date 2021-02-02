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



}

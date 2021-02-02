package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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

    By password  = By.xpath("//*[@id=\"passwd\"]");
    public void setPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    By birthDay = By.xpath("//*[@id=\"days\"]");
    public void setBirthDay (String day) {
        Select bDay = new Select(driver.findElement(birthDay));
        bDay.selectByValue(day);
    }
    //Use the numbers from 1 to 12 to slect the month
    By birthMonth = By.xpath("//*[@id=\"months\"]");
    public void setBirthMonth (String month) {
        Select bMonth = new Select(driver.findElement(birthMonth));
        bMonth.selectByValue(month);
    }

    By birthYear = By.xpath("//*[@id=\"years\"]");
    public void setBirthYear (String year) {
        Select bYear = new Select(driver.findElement(birthYear));
        bYear.selectByValue(year);
    }



}

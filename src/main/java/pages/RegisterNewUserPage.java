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
    //Use the numbers from 1 to 12 to select the month
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

    By newsletter = By.xpath("//*[@id=\"newsletter\"]");
    public void setNewsletter () {
        driver.findElement(newsletter).click();
    }

    By offers = By.xpath("//*[@id=\"optin\"]");
    public void setOffers () {
        driver.findElement(offers).click();
    }

    By company = By.xpath("//*[@id=\"company\"]");
    public void setCompany(String myCompany) {
        driver.findElement(company).sendKeys(myCompany);
    }

    By address1 = By.xpath("//*[@id=\"address1\"]");
    public void setAddress1(String myAddress) {
        driver.findElement(address1).sendKeys(myAddress);
    }

    By address2 = By.xpath("//*[@id=\"address2\"]");
    public void setAddress2(String myAddress) {
        driver.findElement(address2).sendKeys(myAddress);
    }

    By city = By.xpath("//*[@id=\"city\"]");
    public void setCity(String myCity) {
        driver.findElement(city).sendKeys(myCity);
    }


    By country = By.xpath("//*[@id=\"id_country\"]");
    public void setCountry (String myCountry) {
        Select countrySelector = new Select(driver.findElement(country));
        countrySelector.selectByValue(myCountry);
    }

    By state = By.xpath("//*[@id=\"id_state\"]");
    public void setState (String myState) {
        Select stateSelector = new Select(driver.findElement(state));
        stateSelector.selectByValue(myState);
    }

    By postalCodeX = By.xpath("//*[@id=\"postcode\"]");
    public void setPostalCode(String postalCode) {
        driver.findElement(postalCodeX).sendKeys(postalCode);
    }

    By additionalInfo = By.xpath("//*[@id=\"other\"]");
    public void setAdditionalInfo(String additionalInformation) {
        driver.findElement(additionalInfo).sendKeys(additionalInformation);
    }

    By homePhone = By.xpath("//*[@id=\"phone\"]");
    public void setHomePhone(String homePhoneN) {
        driver.findElement(homePhone).sendKeys(homePhoneN);
    }

    By mobilePhone = By.xpath("//*[@id=\"phone_mobile\"]");
    public void setMobilePhone(String mobilePhoneN) {
        driver.findElement(mobilePhone).sendKeys(mobilePhoneN);
    }

    By addAlias = By.xpath("//*[@id=\"alias\"]");
    public void setAddressAlias(String addressAlias) {
        driver.findElement(addAlias).sendKeys(addressAlias);
    }

    By registetBtn = By.xpath("//*[@id=\"submitAccount\"]");
    public void registerNewUser() {
        driver.findElement(registetBtn).click();
    }

    





}

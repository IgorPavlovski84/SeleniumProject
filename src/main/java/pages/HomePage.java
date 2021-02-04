package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    public void clickToSignIn() {
        driver.findElement(signIn).click();
    }

    By contactUs = By.xpath("//*[@id=\"contact-link\"]/a");
    public void clickToContactUs(){
        driver.findElement(contactUs).click();
    }

    By search = By.xpath("//*[@id=\"search_query_top\"]");
    public void enterTermToSearch(String searchTerm){
        driver.findElement(search).sendKeys(searchTerm + Keys.ENTER);
    }



}

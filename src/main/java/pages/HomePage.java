package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    /*
    define each functions on the homepage as a method

     */

    public static WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public void goPractice(){

        driver.findElement(By.cssSelector(""));

    }
    public void goLogin(){

        driver.findElements(By.cssSelector(""));

    }

    public void goToSignUp(){

    }

    public void logo(){


    }





}

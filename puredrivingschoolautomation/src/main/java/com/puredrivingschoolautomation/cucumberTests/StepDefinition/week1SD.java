package com.puredrivingschoolautomation.cucumberTests.StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by u.8005353-1 on 16/04/2019.
 */
public class week1SD {


    WebDriver driver;

    @Given("^the web page is opened and user credentials are entered$")
    public void the_web_page_is_opened_and_user_credentials_are_entered() throws Throwable {

        //initialising and setting the location for the Chrome Driver
        System.setProperty("webdriver.chrome.driver", "\\Users\\Documents\\IntelliJ projects\\creating\\PDS\\puredrivingschoolautomation\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // telling the Chrome Driver what website to point to and maximise the window
        driver.get("https://puredrivingschool.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);


//        List<WebElement> loginTab = Collections.singletonList(driver.findElement(By.cssSelector("#menu-item-6686 > a > span.avia-menu-text")));
//        if(loginTab.size() > 0) {
//            // navigates to the "login" tab on the nav
//            driver.findElement(By.cssSelector("#menu-item-6686 > a > span.avia-menu-text")).click();
//            Thread.sleep(1000);
//
//            // enters username
//            WebElement login = driver.findElement(By.cssSelector("#ws-plugin--s2member-pro-login-widget-username"));
//            login.sendKeys("F4H_Romeo");
//
//            // enter password
//            WebElement pass = driver.findElement(By.cssSelector("#ws-plugin--s2member-pro-login-widget-password"));
//            pass.sendKeys("J0nes.18.T4gue");
//            Thread.sleep(1000);
//
//            // click remember me
//            driver.findElement(By.cssSelector("#ws_plugin__s2member_pro_login_widget-3 > div > form > div.ws-plugin--s2member-pro-login-widget-remember-me > label > input[type=\"checkbox\"]")).click();
//            Thread.sleep(1000);
//
//            // click "Log Me In" button
//            driver.findElement(By.cssSelector("#ws_plugin__s2member_pro_login_widget-3 > div > form > div.ws-plugin--s2member-pro-login-widget-submit > input.btn.btn-primary")).click();
//            Thread.sleep(1000);
//        } else {


        // go straight to membersite
        driver.findElement(By.cssSelector("#menu-item-837 > a > span.avia-menu-text")).click();
        Thread.sleep(3000);


//        }

//        // if screen goes to another log in page uncomment
//       WebElement loginAgain = driver.findElement(By.cssSelector("#user_login"));
//        loginAgain.sendKeys("F4H_Romeo");
//        Thread.sleep(1000);
//
//        WebElement passAgain = driver.findElement(By.cssSelector("#user_pass"));
//        passAgain.sendKeys("J0nes.18.T4gue");
//        Thread.sleep(1000);
//
//        driver.findElement(By.cssSelector("#wp-submit")).click();
//        Thread.sleep(1000);


    }


    @Given("^GT Sprint Series is selected$")
    public void gt_Sprint_Series_is_selected() throws Throwable {
        // select GT Sprint
        driver.findElement(By.cssSelector("#six-columns > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-default.av-custom-tab-color > a:nth-child(2) > span.av-outer-tab-title > span")).click();
        Thread.sleep(1000);

    }

    @Given("^Ferrari (\\d+) GT(\\d+) is selected$")
    public void ferrari_GT_is_selected(int arg1, int arg2) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/a")).click();
        Thread.sleep(1000);


    }

    @Then("^Week (\\d+) GT is selected$")
    public void week_GT_is_selected(int arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[1]/a[2]/span[2]/span")).click();
        Thread.sleep(1000);

    }

    @Then("^Setup File is downloaded$")
    public void setup_File_is_downloaded() throws Throwable {

//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[2]/div[2]/div/div/div[1]/section[2]/div/div/a")).click();
        Thread.sleep(1000);
    }

    @Then("^Membersite nav link is selected$")
    public void membersite_nav_link_is_selected() throws Throwable {
        driver.findElement(By.cssSelector("#menu-item-837 > a > span.avia-menu-text")).click();
        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#six-columns > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-default.av-custom-tab-color > a:nth-child(2) > span.av-outer-tab-title > span")).click();
//        Thread.sleep(1000);

    }


    @Then("^Audi R(\\d+) GT(\\d+) is selected$")
    public void audi_R_GT_is_selected(int arg1, int arg2) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[3]/div[1]/div/div/a")).click();
        Thread.sleep(1000);
    }

    @Then("^BMW Z(\\d+) GT(\\d+) is selected$")
    public void bmw_Z_GT_is_selected(int arg1, int arg2) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[4]/div[1]/div/div/a")).click();
        Thread.sleep(1000);
    }

    @Then("^Mercedes AMG GT(\\d+) is selected$")
    public void mercedes_AMG_GT_is_selected(int arg1) throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/a")).click();
        Thread.sleep(1000);
    }

    @Then("^IMSA is selected$")
    public void imsa_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Porsche (\\d+) GTE is selected$")
    public void porsche_GTE_is_selected(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Week (\\d+) IMSA is selected$")
    public void week_IMSA_is_selected(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Ferrari (\\d+) GTE is selected$")
    public void ferrari_GTE_is_selected(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^BMW M(\\d+) GTE is selected$")
    public void bmw_M_GTE_is_selected(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Ford GT GTE is selected$")
    public void ford_GT_GTE_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Le Mans is selected$")
    public void le_Mans_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Audi R(\\d+) LMP(\\d+) is selected$")
    public void audi_R_LMP_is_selected(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Week (\\d+) Le Mans is selected$")
    public void week_Le_Mans_is_selected(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Porsche (\\d+) LMP(\\d+) is selected$")
    public void porsche_LMP_is_selected(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
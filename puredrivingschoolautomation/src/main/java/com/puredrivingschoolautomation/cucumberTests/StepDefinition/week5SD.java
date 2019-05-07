//package com.puredrivingschoolautomation.cucumberTests.StepDefinition;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by u.8005353-1 on 16/04/2019.
// */
//public class week5SD {
//
//    WebDriver driver;
//
//    @Given("^the web page is opened and user credentials are entered$")
//    public void the_web_page_is_opened_and_user_credentials_are_entered() throws Throwable {
//
//        //initialising and setting the location for the Chrome Driver
//        System.setProperty("webdriver.chrome.driver", "\\Users\\Documents\\IntelliJ projects\\creating\\PDS\\puredrivingschoolautomation\\src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        // telling the Chrome Driver what website to point to and maximise the window
//        driver.get("https://puredrivingschool.com");
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//
//
//        List<WebElement> loginTab = Collections.singletonList(driver.findElement(By.cssSelector("#menu-item-6686 > a > span.avia-menu-text")));
//        if (loginTab.size() > 0) {
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
//
//
//            // go straight to membersite
//            driver.findElement(By.cssSelector("#menu-item-837 > a > span.avia-menu-text")).click();
//            Thread.sleep(3000);
//
//
//        }
//
//    }
////////////////////////////////////////////////////////////////////
//
//    // return to membersite and week
//
/////////////////////////////////////////////////////////////////////
//
//
//    @Then("^Membersite nav link is selected$")
//    public void membersite_nav_link_is_selected() throws Throwable {
//        driver.findElement(By.cssSelector("#menu-item-837 > a > span.avia-menu-text")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Week eight GT is selected$")
//    public void week_eight_GT_is_selected() throws Throwable {
//
//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[1]/a[9]/span[2]/span")).click();
//        Thread.sleep(1000);
//
//    }
//
//
/////////////////////////////////////////////////////////////////////
//
//// GT Sprint
//
/////////////////////////////////////////////////////////////////////
//
//
//    @Given("^GT Sprint Series is selected$")
//    public void gt_Sprint_Series_is_selected() throws Throwable {
//        // select GT Sprint
//        driver.findElement(By.cssSelector("#six-columns > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-default.av-custom-tab-color > a:nth-child(2) > span.av-outer-tab-title > span")).click();
//        Thread.sleep(1000);
//
//    }
//
//    //////////////// Cars
//
//
//    @Given("^Ferrari (\\d+) GT(\\d+) is selected$")
//    public void ferrari_GT_is_selected(int arg1, int arg2) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Audi R(\\d+) GT(\\d+) is selected$")
//    public void audi_R_GT_is_selected(int arg1, int arg2) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[3]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^BMW Z(\\d+) GT(\\d+) is selected$")
//    public void bmw_Z_GT_is_selected(int arg1, int arg2) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[4]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Mercedes AMG GT(\\d+) is selected$")
//    public void mercedes_AMG_GT_is_selected(int arg1) throws Throwable {
//
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Mclaren GT(\\d+) is selected$")
//    public void Mclaren_GT_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
/////////////////////////////////////////////////////////////////////
//
//// IMSA
//
/////////////////////////////////////////////////////////////////////
//
//
//
//    @Then("^IMSA is selected$")
//    public void imsa_is_selected() throws Throwable {
//        driver.findElement(By.cssSelector("#six-columns > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-default.av-custom-tab-color > a:nth-child(3) > span.av-outer-tab-title > span")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Week (\\d+) IMSA is selected$")
//    public void week_IMSA_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[1]/a[2]/span[2]/span")).click();
//        Thread.sleep(1000);
//    }
//
//    //////////////// Cars
//
//    @Then("^Porsche (\\d+) GTE is selected$")
//    public void porsche_GTE_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[3]/div/div/div[2]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Ferrari (\\d+) GTE is selected$")
//    public void ferrari_GTE_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[3]/div/div/div[3]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^BMW M(\\d+) GTE is selected$")
//    public void bmw_M_GTE_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[3]/div/div/div[4]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Ford GT GTE is selected$")
//    public void ford_GT_GTE_is_selected() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[3]/div/div/div[4]/div[2]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Audi R(\\d+) IMSA is selected$")
//    public void audi_R_IMSA_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/div/a\n")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Mercedes AMG IMSA is selected$")
//    public void mercedes_AMG_IMSA_is_selected() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[3]/div/div/div[3]/div[2]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//
/////////////////////////////////////////////////////////////////////
//
//// Le mans series
//
/////////////////////////////////////////////////////////////////////
//
//    @Then("^Le Mans is selected$")
//    public void le_Mans_is_selected() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[2]/a[4]/span[1]/span")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Week (\\d+) Le Mans is selected$")
//    public void week_Le_Mans_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[1]/a[2]/span[2]/span")).click();
//        Thread.sleep(1000);
//    }
//
//    //////////////// Cars
//
//
//    @Then("^Audi R(\\d+) LMP(\\d+) is selected$")
//    public void audi_R_LMP_is_selected(int arg1, int arg2) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[4]/div/div/div[2]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Porsche (\\d+) LMP(\\d+) is selected$")
//    public void porsche_LMP_is_selected(int arg1, int arg2) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[4]/div/div/div[3]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^HPD is selected$")
//    public void HPD_is_selected() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[4]/div/div/div[4]/div[1]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//
//    @Then("^Porsche (\\d+) GTE LMS is selected$")
//    public void porsche_GTE_LMS_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[4]/div/div/div[2]/div[2]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Ferrari (\\d+) GTE LMS is selected$")
//    public void ferrari_GTE_LMS_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[4]/div/div/div[3]/div[2]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^BMW M(\\d+) GTE LMS is selected$")
//    public void bmw_M_GTE_LMS_is_selected(int arg1) throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[4]/div/div/div[4]/div[2]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^Ford GT GTE LMS is selected$")
//    public void ford_GT_GTE_LMS_is_selected() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"six-columns\"]/div/div[1]/div[4]/div/div/div[2]/div[3]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//
//    ////////////////////////////////////////////
//
////   setup, Blap, Olap and motec
//
//
///////////////////////////////////////////
//
//
//    @Then("^Setup File is downloaded$")
//    public void setup_File_is_downloaded() throws Throwable {
//
//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[2]/div[2]/div/div/div[1]/section[2]/div/div/a")).click();
//        Thread.sleep(5000);    //*[@id="setup"]/div/div[2]/div[9]/div/div/div[1]/section[2]/div/div/a/span[1]
//    }
//
//    @Then("^blap file is downloaded$")
//    public void blap_file_is_downloaded() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[2]/div[2]/div/div/div[1]/section[6]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^olap file is downloaded$")
//    public void olap_file_is_downloaded() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[2]/div[2]/div/div/div[1]/section[8]/div/div/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("^motec file is downloaded$")
//    public void motec_file_is_downloaded() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"setup\"]/div/div[2]/div[2]/div/div/div[1]/section[4]/div/div/a/span[1]")).click();
//        Thread.sleep(1000);
//    }
//
//
//
//}

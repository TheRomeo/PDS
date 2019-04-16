package com.puredrivingschoolautomation.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by u.8005353-1 on 16/04/2019.
 */
public class Objects {

    public static void main(String[] args) throws InterruptedException {


        }

    private static void openWebpage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://puredrivingschool.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Pure Driving School - iRacing - Setups | Videos | Coaching"))
            System.out.println("Title matches");
        else
            System.out.println(title);

    }
}



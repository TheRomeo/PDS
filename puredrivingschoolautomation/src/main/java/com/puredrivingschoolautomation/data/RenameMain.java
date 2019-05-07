package com.puredrivingschoolautomation.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static com.puredrivingschoolautomation.data.Week1Rename.*;
import static com.puredrivingschoolautomation.data.Week8Rename.*;

/**
 * Created by u.8005353-1 on 16/04/2019.
 */
public class RenameMain {

    // GT Strings
    static String GTweek1 = "WatkinsGlen";
    static String GTweek2 = "Bathurst";
    static String GTweek3 = "RoadAtlanta";
    static String GTweek4 = "Sebring";
    static String GTweek5 = "LagunaSeca";
    static String GTweek6 = "LimeRock";
    static String GTweek7 = "RoadAmerica";
    static String GTweek8 = "Nordschleife";
    static String GTweek9 = "COTA";
    static String GTweek10 = "Monza";
    static String GTweek11 = "Donnington";
    static String GTweek12 = "Imola";

    // IMSA Strings
    static String IMSAweek1 = "Sebring";
    static String IMSAweek2 = "WatkinsGlen";
    static String IMSAweek3 = "HomesteadMiami";
    static String IMSAweek4 = "Monza";
    static String IMSAweek5 = "Spa";
    static String IMSAweek6 = "Imola";
    static String IMSAweek7 = "RoadAmerica";
    static String IMSAweek8 = "Mid-Ohio";
    static String IMSAweek9 = "RoadAtlanta";
    static String IMSAweek10 = "Daytona";
    static String IMSAweek11 = "Motreal";
    static String IMSAweek12 = "BelleIsle";

    // ILMS Strings
    static String ILMSweek1 = "RoadAmerica";
    static String ILMSweek2 = "Monza";
    static String ILMSweek3 = "Silverstone";
    static String ILMSweek4 = "Suzuka";
    static String ILMSweek5 = "WatkinsGlen";
    static String ILMSweek6 = "Sebring";
    static String ILMSweek7 = "Mosport";
    static String ILMSweek8 = "Spa";
    static String ILMSweek9 = "Nuerburgring";
    static String ILMSweek10 = "Indy";
    static String ILMSweek11 = "Bathurst";
    static String ILMSweek12 = "LeMans";




    public static void main(String[] args) throws InterruptedException {


        week8FerrariGT();
        week8AudiGT();
        week8BMWGT();
        week8MercGT();
        week8McLarenGT();

        week8PorscheIMSA();
        week8FerrariIMSA();
        week8BMWIMSA();
        week8FordIMSA();
        week8AudiIMSA();
        week8MercIMSA();

        week8AudiR18ILMS();
        week8Porsche919ILMS();
        week8HPDILMS();
        week8FerrariILMS();
        week8Porsche911ILMS();
        week8BMWILMS();
        week8FordILMS();


        // blap rename

        week8FerrariGTblap();
        week8AudiGTblap();
        week8BMWGTblap();
        week8MercGTblap();
        week8McLarenGTblap();

        week8FerrariIMSAblap();
        week8BMWIMSAblap();
        week8FordIMSAblap();
        week8AudiIMSAblap();
        week8MercIMSAblap();

        week8AudiR18ILMSblap();
        week8Porsche919ILMSblap();
        week8HPDILMSblap();
        week8FerrariILMSblap();
        week8Porsche911ILMSblap();
        week8BMWILMSblap();
        week8FordILMSblap();


        // olap rename

        week8FerrariGTolap();
        week8AudiGTolap();
        week8BMWGTolap();
        week8MercGTolap();
        week8McLarenGTolap();

        week8PorscheIMSAolap();
        week8FerrariIMSAolap();
        week8BMWIMSAolap();
        week8FordIMSAolap();
        week8AudiIMSAolap();
        week8MercIMSAolap();

        week8AudiR18ILMSolap();
        week8Porsche919ILMSolap();
        week8HPDILMSolap();
        week8FerrariILMSolap();
        week8Porsche911ILMSolap();
        week8BMWILMSolap();
        week8FordILMSolap();


        // motec rename

        week8FerrariGTmotec();
        week8AudiGTmotec();
        week8BMWGTmotec();
        week8MercGTmotec();
        week8McLarenGTmotec();

        week8PorscheIMSAmotec();
        week8FerrariIMSAmotec();
        week8BMWIMSAmotec();
        week8FordIMSAmotec();
        week8AudiIMSAmotec();
        week8MercIMSAmotec();

        week8AudiR18ILMSmotec();
        week8Porsche919ILMSmotec();
        week8HPDILMSmotec();
        week8FerrariILMSmotec();
        week8Porsche911ILMSmotec();
        week8BMWILMSmotec();
        week8FordILMSmotec();
    }
}




































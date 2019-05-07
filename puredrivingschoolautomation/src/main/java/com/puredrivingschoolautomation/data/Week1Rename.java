package com.puredrivingschoolautomation.data;

import java.io.File;

import static com.puredrivingschoolautomation.data.RenameMain.*;

public class Week1Rename {

    // GT Sprint

    public static void week1FerrariGT() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_ferrari_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Ferrari_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT ferrari week 1 ");
        }
    }

    public static void week1AudiGT() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_audi_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Audi_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT audi week 1 ");
        }
    }

    public static void week1BMWGT() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_bmw_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_BMW_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT bmw week 1 ");
        }
    }

    public static void week1MercGT() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mercedes_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Merc_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT merc week 1 ");
        }
    }

    public static void week1McLarenGT() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mclaren_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_McLaren_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT McLaren week 1 ");
        }
    }

    // IMSA


    public static void week1PorscheIMSA() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_porschegte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Porsche_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Porsche week 1 ");
        }
    }

    public static void week1FerrariIMSA() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_ferrarigte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ferrari_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ferrari week 1 ");
        }
    }

    public static void week1BMWIMSA() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_bmwgte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_BMW_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA BMW week 1 ");
        }
    }

    public static void week1FordIMSA() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_fordgte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ford_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ford week 1 ");
        }
    }

    public static void week1AudiIMSA() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_audi_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Audi_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Audi week 1 ");
        }
    }

    public static void week1MercIMSA() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_mercedes_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Merc_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Merc week 1 ");
        }
    }

    // ILMS

    public static void week1AudiR18ILMS() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_audilmp1_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Audi_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Audi R18 week 1 ");
        }
    }

    public static void week1Porsche919ILMS() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschelmp1_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche919_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 919 week 1 ");
        }
    }

    public static void week1HPDILMS() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_hpd_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_HPD_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS HPD week 1 ");
        }
    }

    public static void week1FerrariILMS() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_ferrarigte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ferrari_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ferrari week 1 ");
        }
    }

    public static void week1Porsche911ILMS() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschegte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche911_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 911 week 1 ");
        }
    }

    public static void week1BMWILMS() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_bmwgte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_BMW_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS BMW week 1 ");
        }
    }

    public static void week1FordILMS() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_fordgte_week1.sto");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ford_PDS_R.sto");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ford week 1 ");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /////////// blap rename


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////blap

    public static void week1FerrariGTblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_ferrari_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Ferrari_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT ferrari week 1 ");
        }
    }

    public static void week1AudiGTblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_audi_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Audi_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT audi week 1 ");
        }
    }

    public static void week1BMWGTblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_bmw_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_BMW_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT bmw week 1 ");
        }
    }

    public static void week1MercGTblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mercedes_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Merc_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT merc week 1 ");
        }
    }

    public static void week1McLarenGTblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mclaren_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_McLaren_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT McLaren week 1 ");
        }
    }

    // IMSA


    public static void week1PorscheIMSAblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_porschegte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Porsche_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Porsche week 1 ");
        }
    }

    public static void week1FerrariIMSAblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_ferrarigte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ferrari_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ferrari week 1 ");
        }
    }

    public static void week1BMWIMSAblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_bmwgte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_BMW_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA BMW week 1 ");
        }
    }

    public static void week1FordIMSAblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_fordgte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ford_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ford week 1 ");
        }
    }

    public static void week1AudiIMSAblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_audi_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Audi_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Audi week 1 ");
        }
    }

    public static void week1MercIMSAblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_mercedes_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Merc_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Merc week 1 ");
        }
    }

    // ILMS

    public static void week1AudiR18ILMSblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_audilmp1_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Audi_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Audi R18 week 1 ");
        }
    }

    public static void week1Porsche919ILMSblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschelmp1_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche919_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 919 week 1 ");
        }
    }

    public static void week1HPDILMSblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_hpd_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_HPD_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS HPD week 1 ");
        }
    }

    public static void week1FerrariILMSblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_ferrarigte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ferrari_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ferrari week 1 ");
        }
    }

    public static void week1Porsche911ILMSblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschegte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche911_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 911 week 1 ");
        }
    }

    public static void week1BMWILMSblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_bmwgte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_BMW_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS BMW week 1 ");
        }
    }

    public static void week1FordILMSblap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_fordgte_week1.blap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ford_PDS.blap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ford week 1 ");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    /////// olap rename

    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void week1FerrariGTolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_ferrari_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Ferrari_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT ferrari week 1 ");
        }
    }

    public static void week1AudiGTolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_audi_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Audi_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT audi week 1 ");
        }
    }

    public static void week1BMWGTolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_bmw_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_BMW_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT bmw week 1 ");
        }
    }

    public static void week1MercGTolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mercedes_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Merc_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT merc week 1 ");
        }
    }

    public static void week1McLarenGTolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mclaren_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_McLaren_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT McLaren week 1 ");
        }
    }

    // IMSA


    public static void week1PorscheIMSAolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_porschegte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Porsche_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Porsche week 1 ");
        }
    }

    public static void week1FerrariIMSAolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_ferrarigte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ferrari_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ferrari week 1 ");
        }
    }

    public static void week1BMWIMSAolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_bmwgte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_BMW_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA BMW week 1 ");
        }
    }

    public static void week1FordIMSAolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_fordgte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ford_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ford week 1 ");
        }
    }

    public static void week1AudiIMSAolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_audi_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Audi_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Audi week 1 ");
        }
    }

    public static void week1MercIMSAolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_mercedes_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Merc_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Merc week 1 ");
        }
    }

    // ILMS

    public static void week1AudiR18ILMSolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_audilmp1_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Audi_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Audi R18 week 1 ");
        }
    }

    public static void week1Porsche919ILMSolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschelmp1_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche919_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 919 week 1 ");
        }
    }

    public static void week1HPDILMSolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_hpd_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_HPD_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS HPD week 1 ");
        }
    }

    public static void week1FerrariILMSolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_ferrarigte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ferrari_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ferrari week 1 ");
        }
    }

    public static void week1Porsche911ILMSolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschegte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche911_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 911 week 1 ");
        }
    }

    public static void week1BMWILMSolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_bmwgte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_BMW_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS BMW week 1 ");
        }
    }

    public static void week1FordILMSolap() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_fordgte_week1.olap");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ford_PDS.olap");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ford week 1 ");
        }
    }




////////////////////////////////////////////////////////////////////////////////////////////////

    ///// motec rename

///////////////////////////////////////////////////////////////////////////////////////////////


    public static void week1FerrariGTmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_ferrari_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Ferrari_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT ferrari week 1 ");
        }
    }

    public static void week1AudiGTmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_audi_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Audi_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT audi week 1 ");
        }
    }

    public static void week1BMWGTmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_bmw_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_BMW_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT bmw week 1 ");
        }
    }

    public static void week1MercGTmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mercedes_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_Merc_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT merc week 1 ");
        }
    }

    public static void week1McLarenGTmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\gts_mclaren_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + GTweek1 + "_GT_McLaren_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed GT McLaren week 1 ");
        }
    }

    // IMSA


    public static void week1PorscheIMSAmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_porschegte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Porsche_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Porsche week 1 ");
        }
    }

    public static void week1FerrariIMSAmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_ferrarigte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ferrari_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ferrari week 1 ");
        }
    }

    public static void week1BMWIMSAmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_bmwgte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_BMW_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA BMW week 1 ");
        }
    }

    public static void week1FordIMSAmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_fordgte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Ford_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Ford week 1 ");
        }
    }

    public static void week1AudiIMSAmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_audi_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Audi_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Audi week 1 ");
        }
    }

    public static void week1MercIMSAmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\imsa_mercedes_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + IMSAweek1 + "_IMSA_Merc_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed IMSA Merc week 1 ");
        }
    }

    // ILMS

    public static void week1AudiR18ILMSmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_audilmp1_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Audi_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Audi R18 week 1 ");
        }
    }

    public static void week1Porsche919ILMSmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschelmp1_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche919_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 919 week 1 ");
        }
    }

    public static void week1HPDILMSmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_hpd_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_HPD_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS HPD week 1 ");
        }
    }

    public static void week1FerrariILMSmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_ferrarigte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ferrari_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ferrari week 1 ");
        }
    }

    public static void week1Porsche911ILMSmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_porschegte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Porsche911_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Porsche 911 week 1 ");
        }
    }

    public static void week1BMWILMSmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_bmwgte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_BMW_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS BMW week 1 ");
        }
    }

    public static void week1FordILMSmotec() {
        File oldfile = new File("C:\\Users\\romeo\\Downloads\\lms_fordgte_week1.ld");
        File newfile = new File("C:\\Users\\romeo\\Downloads\\19S2_" + ILMSweek1 + "_ILMS_Ford_PDS.ld");

        if (oldfile.renameTo(newfile)) {
            System.out.println("File name changed successful");
        } else {
            System.out.println("Rename failed ILMS Ford week 1 ");
        }
    }





}

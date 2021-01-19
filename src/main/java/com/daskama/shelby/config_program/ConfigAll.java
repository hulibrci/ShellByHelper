package com.daskama.shelby.config_program;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.Boolean.parseBoolean;

public class ConfigAll {

    private static String tokenShellby;
    private static String activity;
    private static String botMenu;

    //mysql
    private static String mysqlHost;
    private static String mysqlDbname;
    private static String mysqlName;
    private static String mysqlPassword;

    //FIRST TIME INSTALL
    private static boolean adminInstallFirst;


    private static int timeEventerInt;

    /**
     * Init config
     */

    public void initconfig() {
        Properties prop = new Properties();

        String timeEventer;
        String adminInstallString;
        try (InputStream fis = new FileInputStream("config/config.properties")) {
            prop.load(fis);
            tokenShellby = prop.getProperty("Bot_Token");
            activity = prop.getProperty("Bot_Activity");
            botMenu = prop.getProperty("Bot_Menu");

            mysqlHost = prop.getProperty("mysql_host");
            mysqlDbname = prop.getProperty("mysql_db");
            mysqlName = prop.getProperty("mysql_user");
            mysqlPassword = prop.getProperty("mysql_passwor");


            //String to Bool
            adminInstallString = prop.getProperty("ADMIN_INSTALL_MODE_FIRST_TIME");
            adminInstallFirst = parseBoolean(adminInstallString);


            //string to int
            timeEventer = prop.getProperty("Time_event");
            timeEventerInt = Integer.parseInt(timeEventer);
            //create a INVITE URL
            System.out.println("Load Config");
        } catch (Exception e) {
            System.out.println("Unable to find the specified properties file");
            e.printStackTrace();
            return;
        }
    }


    //GET METODY

    public static boolean isAdminInstallFirst() {
        return adminInstallFirst;
    }

    public static String getMysqlHost() {
        return mysqlHost;
    }

    public static String getMysqlDbname() {
        return mysqlDbname;
    }

    public static String getMysqlName() {
        return mysqlName;
    }

    public static String getMysqlPassword() {
        return mysqlPassword;
    }

    public static String getBotMenu() {
        return botMenu;
    }

    public static String getActivity() {
        return activity;
    }

    public static String getTokenShellby() {
        return tokenShellby;
    }

    public static int getTimeEventerInt() {
        return timeEventerInt;
    }
}

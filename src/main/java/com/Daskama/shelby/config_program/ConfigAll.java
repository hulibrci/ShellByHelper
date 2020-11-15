package com.Daskama.shelby.config_program;


import java.io.*;
import java.util.Properties;

import static java.lang.Boolean.parseBoolean;

public class ConfigAll {

    private static String token_shellby ;
    private static String Activity;
    private static String bot_menu;

    //mysql
    private static String mysql_host ;
    private static String mysql_dbname  ;
    private static String mysql_name ;
    private static String mysql_password  ;

    //FIRST TIME INSTALL
    private static  boolean ADMIN_INSTALL_MODE_FIRST_TIME;


    private static int time_eventer_int;



    public void initconfig(){
        Properties prop = new Properties();

        String time_eventer;
        String admin_install_string;
        try(InputStream fis = new FileInputStream("config/config.properties")) {
            prop.load(fis);
            token_shellby = prop.getProperty("Bot_Token");
            Activity = prop.getProperty("Bot_Activity");
            bot_menu = prop.getProperty("Bot_Menu");

            mysql_host = prop.getProperty("mysql_host");
            mysql_dbname = prop.getProperty("mysql_db");
            mysql_name = prop.getProperty("mysql_user");
            mysql_password = prop.getProperty("mysql_passwor");


            //String to Bool
            admin_install_string = prop.getProperty("ADMIN_INSTALL_MODE_FIRST_TIME");
            ADMIN_INSTALL_MODE_FIRST_TIME = parseBoolean(admin_install_string);


            //string to int
            time_eventer = prop.getProperty("Time_event");
            time_eventer_int = Integer.parseInt(time_eventer);
            //create a INVITE URL
            System.out.println("Load Config");
        }
        catch(Exception e) {
            System.out.println("Unable to find the specified properties file");
            e.printStackTrace();
            return;
        }
    }


//GET METODY


    public static boolean isAdminInstallModeFirstTime() {
        return ADMIN_INSTALL_MODE_FIRST_TIME;
    }

    public static String getMysql_host() {
        return mysql_host;
    }

    public static String getMysql_dbname() {
        return mysql_dbname;
    }

    public static String getMysql_name() {
        return mysql_name;
    }

    public static String getMysql_password() {
        return mysql_password;
    }

    public static String getBot_menu() {
        return bot_menu;
    }

    public static String getActivity() {
        return Activity;
    }

    public static String getToken_shellby() {
        return token_shellby;
    }

    public static int getTime_eventer_int() {
        return time_eventer_int;
    }
}

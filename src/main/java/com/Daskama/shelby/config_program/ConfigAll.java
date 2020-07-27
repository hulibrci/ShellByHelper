package com.Daskama.shelby.config_program;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigAll {

    private static String token_shellby ;
    private static String Activity;
    private static String bot_menu;


    public void initconfig(){
        Properties prop = new Properties();
        try(InputStream fis = new FileInputStream("src/main/resources/config.properties")) {
            prop.load(fis);
            token_shellby = prop.getProperty("Bot_Token");
            Activity = prop.getProperty("Bot_Activity");
            bot_menu = prop.getProperty("Bot_Menu");

            //create a INVITE URL

        }
        catch(Exception e) {
            System.out.println("Unable to find the specified properties file");
            e.printStackTrace();
            return;
        }

    }
//GET METODY


    public static String getBot_menu() {
        return bot_menu;
    }

    public static String getActivity() {
        return Activity;
    }

    public static String getToken_shellby() {
        return token_shellby;
    }

}

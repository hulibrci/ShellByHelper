package com.Daskama.shelby.config_program;


import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigAll {



    private static String token_shellby ;

    public void initconfig(){
        Properties prop = new Properties();
        try(InputStream fis = new FileInputStream("src/main/resources/config.properties")) {
            prop.load(fis);
        }
        catch(Exception e) {
            System.out.println("Unable to find the specified properties file");
            e.printStackTrace();
            return;
        }

    }


    public static String getToken_shellby() {
        return token_shellby;
    }

}

package com.Daskama.shelby.Core;


import com.Daskama.shelby.Mysql.MysqlUploader;
import com.Daskama.shelby.comands.*;
import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;





public class MainVoid {
    //COLOR
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static    MysqlUploader mysql;


    //save invite string
    private static String INVITE_URL ;

    public static void main(String[] args) {
        //Config
        ConfigAll config = new ConfigAll();
        //CONFIG LOAD
        config.initconfig();

        //mysql
        mysql = new MysqlUploader();



        //pripoji sa bot
        DiscordApi api = new DiscordApiBuilder()
                .setToken(config.getToken_shellby())
                .login()
                .join();
        //LOGO
            System.out.println( "#---------------------------------------------------------------------------#");
            System.out.println( "ShellBy_Helper v 0.7 is now ONLINE" );
            System.out.println( "Developer : Daskama#2967" );
            System.out.println("You can invite the bot by using the following url: \n " + api.createBotInvite());
            System.out.println("#---------------------------------------------------------------------------#");
            //ulozi invite string
            INVITE_URL = api.createBotInvite();
            //command lissener
            api.addListener(new ComanndShellby_help()); //help comand
            api.addListener(new ComanndShellby_reverseshells()); //reverse shell comand
            api.addListener(new ComanndShellby_invite()); // invite comand
            api.addListener(new ComanndShellby_tutorial()); // tutorial comands
            api.addListener(new ComanndShellby_restrictedshell()); // restrictedShell
            api.addListener(new ComanndShellby_admincomand()); // restrictedShell
            //activity
            api.updateActivity(config.getActivity());


            if (config.isAdminInstallModeFirstTime()){
                mysql.createTableMYSQL();
            }



            //log a mesage to join  bot
            api.addServerJoinListener(event ->{
                long  Owner_Server;
                long  Server_id;

                Owner_Server = event.getServer().getOwner().get().getId();
                Server_id =  Long.parseLong(event.getServer().getIdAsString());
                System.out.println("Shellby Join a server : " + event.getServer().getName() + " Server ID : " + event.getServer().getIdAsString() + " Owner ID :" + Owner_Server  );
                mysql.uploadToMysqlServer(Server_id , Owner_Server);

            });


            //log a mesage to leave bot
            api.addServerLeaveListener(event ->{
                long  Owner_Server;
                long  Server_id;

                Owner_Server = event.getServer().getOwner().get().getId();
                Server_id =  Long.parseLong(event.getServer().getIdAsString());
                System.out.println("Shellby Leave a server : " + event.getServer().getName()+ " Server ID : " + event.getServer().getIdAsString() + Owner_Server);
                mysql.uploadToMysqlServer(Server_id , Owner_Server);

            });

    }




    //getter invite url
    public static String getInviteUrl() {
        return INVITE_URL;
    }
}

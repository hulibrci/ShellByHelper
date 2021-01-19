package com.daskama.shelby.Core;


import com.daskama.shelby.Mysql.MysqlUploader;

import com.daskama.shelby.comands.ComanndShellbyAdmincomand;
import com.daskama.shelby.comands.ComanndShellbyHelp;
import com.daskama.shelby.comands.ComanndShellbyInvite;
import com.daskama.shelby.comands.ComanndShellbyRestrictedshell;
import com.daskama.shelby.comands.ComanndShellbyReverseshells;
import com.daskama.shelby.comands.ComanndShellbyTutorial;
import com.daskama.shelby.config_program.ConfigAll;
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


    private static MysqlUploader mysql;


    //save invite string
    private static String inviteLink;


    /**
     * Main pre spustenie bota.
     *
     * @param args run app
     */

    public static void main(String[] args) {
        //Config
        ConfigAll config = new ConfigAll();
        //CONFIG LOAD
        config.initconfig();

        //mysql
        mysql = new MysqlUploader();


        //pripoji sa bot
        DiscordApi api = new DiscordApiBuilder()
            .setToken(config.getTokenShellby())
            .login()
            .join();
        //LOGO
        System.out
            .println(
                "#---------------------------------------------------------------------------#");
        System.out.println("ShellBy_Helper v 0.7 is now ONLINE");
        System.out.println("Developer : daskama#2967");
        System.out
            .println(
                "You can invite the bot by using the following url: \n " + api.createBotInvite());
        System.out
            .println(
                "#---------------------------------------------------------------------------#");
        //ulozi invite string
        inviteLink = api.createBotInvite();
        //command lissener
        api.addListener(new ComanndShellbyHelp()); //help comand
        api.addListener(new ComanndShellbyReverseshells()); //reverse shell comand
        api.addListener(new ComanndShellbyInvite()); // invite comand
        api.addListener(new ComanndShellbyTutorial()); // tutorial comands
        api.addListener(new ComanndShellbyRestrictedshell()); // restrictedShell
        api.addListener(new ComanndShellbyAdmincomand()); // restrictedShell
        //activity
        api.updateActivity(config.getActivity());


        if (config.isAdminInstallFirst()) {
            mysql.createTableMysql();
        }


        //log a mesage to join  bot
        api.addServerJoinListener(event -> {
            long ownerServer;
            long serverid;

            ownerServer = event.getServer().getOwner().get().getId();
            serverid = Long.parseLong(event.getServer().getIdAsString());
            System.out.println(
                "Shellby Join a server : " + event.getServer().getName() + " Server ID : "
                    + event.getServer().getIdAsString() + " Owner ID :" + ownerServer);
            mysql.uploadToMysqlServer(serverid, ownerServer);

        });


        //log a mesage to leave bot
        api.addServerLeaveListener(event -> {
            long ownerServer;
            long serverid;

            ownerServer = event.getServer().getOwner().get().getId();
            serverid = Long.parseLong(event.getServer().getIdAsString());
            System.out.println(
                "Shellby Leave a server : " + event.getServer().getName() + " Server ID : "
                    + event.getServer().getIdAsString() + ownerServer);
            mysql.uploadToMysqlServer(serverid, ownerServer);

        });

    }


    /**
     * Get metoda pre invite link .
     *
     * @return invite url
     */
    //getter invite url
    public static String getInviteLink() {
        return inviteLink;
    }
}

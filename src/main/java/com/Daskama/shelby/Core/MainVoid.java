package com.Daskama.shelby.Core;

import com.Daskama.shelby.comands.ComanndShellby_help;
import com.Daskama.shelby.comands.ComanndShellby_invite;
import com.Daskama.shelby.comands.ComanndShellby_reverseshells;
import com.Daskama.shelby.comands.ComanndShellby_tutorial;
import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.util.logging.FallbackLoggerConfiguration;





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

    //save invite string
    private static String INVITE_URL ;

    public static void main(String[] args) {
        //Config
        ConfigAll config = new ConfigAll();
        //CONFIG LOAD
        config.initconfig();
        //pripoji sa bot
        DiscordApi api = new DiscordApiBuilder()
                .setToken(config.getToken_shellby())
                .login()
                .join();
        //DEBUGING
        FallbackLoggerConfiguration.setDebug(false);
        FallbackLoggerConfiguration.setTrace(false);
        //LOGO
        System.out.println( "#---------------------------------------------------------------------------#");
        System.out.println( "ShellBy_Helper v 0.6 is now ONLINE" );
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
        //activity
        api.updateActivity(config.getActivity());
        //log a mesage to join leave bot
        api.addServerJoinListener(event -> System.out.println("Joined server " + event.getServer().getName()));
        api.addServerLeaveListener(event -> System.out.println("Left server " + event.getServer().getName()));

    }

//admin  check                    if (!event.getMessage().getAuthor().isBotOwner())

    //getter invite url
    public static String getInviteUrl() {
        return INVITE_URL;
    }
}

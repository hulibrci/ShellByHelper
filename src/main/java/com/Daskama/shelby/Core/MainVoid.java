package com.Daskama.shelby.Core;

import com.Daskama.shelby.comands.ComanndShellby_help;
import com.Daskama.shelby.comands.ComanndShellby_reverseshells;
import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.util.logging.FallbackLoggerConfiguration;

//COLOR



public class MainVoid {

    public static void main(String[] args) {
        //Config
        ConfigAll config = new ConfigAll();
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
        System.out.println( "ShellBy_Helper v 0.0.1 is now ONLINE" );
        System.out.println("#---------------------------------------------------------------------------#");
        //prikazy napise
        api.addListener(new ComanndShellby_help());
        api.addListener(new ComanndShellby_reverseshells());
        //activity

    }
}

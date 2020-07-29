package com.Daskama.shelby.Core;

import com.Daskama.shelby.comands.ComanndShellby_help;
import com.Daskama.shelby.comands.ComanndShellby_invite;
import com.Daskama.shelby.comands.ComanndShellby_reverseshells;
import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.util.logging.FallbackLoggerConfiguration;


//COLOR



public class MainVoid {

    private static String INVITE_URL ;
    private static long update_bots;

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
        /**
        // UPTIME
        RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
        update_bots = rb.getUptime();

        CONVERT UPTIME TU TIME REAL
        Date date = new Date(update_bots);
        DateFormat date_formater = new SimpleDateFormat("HH:mm:ss:SSS Z");
        date_formater.setTimeZone(TimeZone.getTimeZone("UTC"));
        String finnal_time = date_formater.format(date);
         **/

        //DEBUGING
        FallbackLoggerConfiguration.setDebug(true);
        FallbackLoggerConfiguration.setTrace(true);

        //LOGO
        System.out.println( "#---------------------------------------------------------------------------#");
        System.out.println( "ShellBy_Helper v 0.1.0 is now ONLINE" );
        System.out.println( "Developer : Daskama" );
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
        System.out.println("#---------------------------------------------------------------------------#");
        //ulozi invite string
        INVITE_URL = api.createBotInvite();
        //command lissener
        api.addListener(new ComanndShellby_help());
        api.addListener(new ComanndShellby_reverseshells());
        api.addListener(new ComanndShellby_invite());
        //activity
        api.updateActivity(config.getActivity());
        //log a mesage to join leave bot
        api.addServerJoinListener(event -> System.out.println("Joined server " + event.getServer().getName()));
        api.addServerLeaveListener(event -> System.out.println("Left server " + event.getServer().getName()));

    }




    //getter invite url
    public static String getInviteUrl() {
        return INVITE_URL;
    }
}

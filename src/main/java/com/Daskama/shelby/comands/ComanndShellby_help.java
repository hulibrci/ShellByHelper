package com.Daskama.shelby.comands;

import com.Daskama.shelby.Core.MainVoid;
import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;


import java.awt.*;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;


public class ComanndShellby_help implements MessageCreateListener {
    //uptime storage
    private static long update_bots;

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message message = event.getMessage();
        ConfigAll config = new ConfigAll();
        MainVoid api_bot = new MainVoid();
        //HELP MENU

        if (config.getBot_menu().equals("normal") ){
        if (message.getContent().equalsIgnoreCase("-shh help")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("Shellby Helper Menu")
                            .setDescription("**Reverse Shell Linux ** \n"
                            + "\n"
                            + "**-shh bash**" + "   Some versions of bash can send you a reverse shell\n "
                            + "**-shh perl**" + "   Perl Reverse Shell\n"
                            + "**-shh python** " + "   Pyhon 2.7 UP Reverse Shell\n"
                            + "**-shh php**" + "  PHP Reverse Shell\n"
                            + "**-shh ruby**"+ "  Ruby Reverse Shell\n"
                            + "**-shh Netcat**" + "  Netcat Reverse Shell\n"
                            + "**-shh Java**" + "  Java Reverse Shell\n"
                            + "**-shh Ncat**" + "  Ncat Reverse Shell\n"
                            + "\n"
                            + "**Info Comands** \n"
                            + "\n"
                            + "**-shh invite**" + "  Give you a invite link\n"
                            + "**-shh status**" + "  My father info\n"
                            )
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(new Color(27, 113, 158)))
                    .send(event.getChannel()).join();

        };
        }
        else if (config.getBot_menu().equals("rolette")){

        }
        else {
            new MessageBuilder()
            .setEmbed(new EmbedBuilder()
                    .setTitle("**ERROR**")
                    .setDescription("No definne shellby menu settings \n"
                    )
                    .setTimestampToNow()
                    .setFooter("Shellby Helper")
                    .setColor(new Color(163, 22, 48)))
                    .send(event.getChannel()).join();
        };

        if (message.getContent().equalsIgnoreCase("-shh status")) {

            //Uptime
            RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
            update_bots = rb.getUptime();

           String uptime_string = String.format("```%d```",update_bots);

            //embded message
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Bot Information**")
                            .addField("**Developer**", "```Daskama#2967```",true)
                            .addField("**Bot Version**", "```0.5```",false)
                            .addField("**Java Version**", "```1.8```",false)
                            .addField("**Bot Create **", "```29/07/2020```" ,true)
                            .addField("**Uptime **", uptime_string ,true)
                            .addField("**Source Code Github **", "```https://github.com/hulibrci/ShellByHelper```" ,true)
                            .setColor(new Color(27, 113, 158)))
                    .send(event.getChannel());

        };



    }
}

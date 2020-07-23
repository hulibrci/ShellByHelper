package com.Daskama.shelby.comands;

import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;

public class ComanndShellby_help implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message message = event.getMessage();
        ConfigAll config = new ConfigAll();
        String help = "help";
        //HELP MENU
        if (message.getContent().equalsIgnoreCase("-shh help")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("Shellby Helper Menu")
                            .setDescription("Reverse Shell :) \n"
                            + "\n"
                            + "-shh bash" + "Some versions of bash can send you a reverse shell\n "
                            + "-shh perl" + "Perl Reverse Shell\n"
                            + "-shh python " + " Pyhon 2.7 UP Reverse Shell\n"
                            + "-shh php" + "PHP Reverse Shell\n"
                            + "-shh ruby"+ "Ruby Reverse Shell\n"
                            + "-shh Netcat" + "Netcat Reverse Shell\n"
                            + "-shh Java" + "Java Reverse Shell\n"
                            + "\n"
                            + "Info Comands\n"
                            + "\n"
                            + "-shh invite" + "Give you a invite link\n"
                            + "-shh autor" + "My father info\n"
                            )
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(Color.BLUE))
                    .send(event.getChannel()).join();

        };

        if (message.getContent().equalsIgnoreCase("-shh autor")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("Autor is : Daskama")
                            .setDescription("Thanks for use a bot")
                            .setColor(Color.BLUE))
                    .send(event.getChannel());

        }

    }
}

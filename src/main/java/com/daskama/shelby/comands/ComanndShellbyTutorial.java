package com.daskama.shelby.comands;

import java.awt.Color;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;


public class ComanndShellbyTutorial implements MessageCreateListener {

    /**
     * Info Commands
     *
     * @param event
     */
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message messageTutorial = event.getMessage();

        if (messageTutorial.getContent().equalsIgnoreCase("-sht netcat")) {
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("**Netcat Tutorial**")
                    .setDescription(
                        "Your remote shell will need a listening netcat instance in order to connect back.\n"
                            + "To setup a listening netcat instance, enter the following:\n"
                            + "```root@kali:~# nc -nvlp PORT ```\n"
                            +
                            "Use a port that is likely allowed via outbound firewall rules on the target network, e.g. 80 (HTTP) / 443 (HTTPS)\n"
                    )
                    .setTimestampToNow()
                    .setFooter("Shellby Helper")
                    .setColor(new Color(27, 113, 158)))
                .send(event.getChannel()).join();
        }
    }
}

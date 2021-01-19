package com.daskama.shelby.comands;

import com.daskama.shelby.Core.MainVoid;

import java.awt.Color;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;


public class ComanndShellbyInvite implements MessageCreateListener {


    /**
     * @param event
     */

    public void onMessageCreate(MessageCreateEvent event) {
        Message shellbyInvite = event.getMessage();
        MainVoid voidinvite = new MainVoid();

        if (shellbyInvite.getContent().equalsIgnoreCase("-shh invite")) {

            String inviteString = String.format("```%s```", voidinvite.getInviteLink());
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("Invite menu")
                    .setDescription(
                        "You can invite the bot by using the following url: \n " + inviteString)
                    .setTimestampToNow()
                    .setColor(new Color(27, 113, 158)))
                .send(event.getChannel()).join();

        }
        ;
    }
}

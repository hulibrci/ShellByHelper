package com.Daskama.shelby.comands;

import com.Daskama.shelby.Core.MainVoid;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import java.awt.*;

public class ComanndShellby_invite implements MessageCreateListener {


    public void onMessageCreate(MessageCreateEvent event) {
        Message shellby_invite = event.getMessage();
        MainVoid voidinvite = new MainVoid();
        if (shellby_invite.getContent().equalsIgnoreCase("-shh invite")) {

            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("Invite menu")
                            .setDescription("You can invite the bot by using the following url: \n" + voidinvite.getInviteUrl())
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(new Color(27, 113, 158)))
                    .send(event.getChannel()).join();

        };
    }
}

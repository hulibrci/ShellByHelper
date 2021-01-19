package com.daskama.shelby.comands;

import com.daskama.shelby.config_program.ConfigAll;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class ComanndShellbyAdmincomand implements MessageCreateListener {

    /**
     * Admin command , zatial nejde .
     *
     * @param event Admin commands
     */

    public void onMessageCreate(MessageCreateEvent event) {
        Message adminMessage = event.getMessage();
        ConfigAll config = new ConfigAll();

        if (adminMessage.getContent().equalsIgnoreCase("-shh admin")) {
            long owner = adminMessage.getServer().get().getOwner().get().getId();
            if (owner == adminMessage.getAuthor().getId()) {

                return;
            }

        }
    }

}

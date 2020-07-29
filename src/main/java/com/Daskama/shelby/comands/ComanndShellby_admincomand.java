package com.Daskama.shelby.comands;

import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class ComanndShellby_admincomand implements MessageCreateListener {

    public void onMessageCreate(MessageCreateEvent event) {
        Message admin_message = event.getMessage();
        ConfigAll config = new ConfigAll();
        if (admin_message.getContent().equalsIgnoreCase("-shh admin") ){

        }
    }

}

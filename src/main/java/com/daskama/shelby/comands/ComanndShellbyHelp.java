package com.daskama.shelby.comands;

import com.daskama.shelby.config_program.ConfigAll;

import java.awt.Color;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageAuthor;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;


import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.concurrent.TimeUnit;


public class ComanndShellbyHelp implements MessageCreateListener {
    //uptime storage
    private static long updateBots;

    /**
     * @param event Help commands
     */

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message message = event.getMessage();
        ConfigAll config = new ConfigAll();
        //HELP MENU

        if (config.getBotMenu().equals("normal")) {
            if (message.getContent().equalsIgnoreCase("-shh help")) {
                new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                        .setTitle("Shellby Helper Menu")
                        .setDescription("**Reverse Shell Linux ** \n"
                            + "\n"
                            + "**-shr bash**" + " - Bash Reverse Shell\n "
                            + "**-shr java**" + " - Java Reverse Shell\n"
                            + "**-shr netcat**" + " - Netcat Reverse Shell\n"
                            + "**-shr ncat**" + " - Ncat Reverse Shell\n"
                            + "**-shr perl**" + " - Perl Reverse Shell\n"
                            + "**-shr python**" + " - Pyhon 2.7 UP Reverse Shell\n"
                            + "**-shr ruby**" + " - Ruby Reverse Shell\n"
                            + "**-shr telent**" + " - Telnet Reverse Shell\n"
                            + "\n"
                            + "**Info Comands** \n"
                            + "\n"
                            + "**-shh invite**" + "  Give you a invite link\n"
                            + "**-shh status**" + "  My father info\n"
                            + "**Info Comands** \n"
                            + "\n"
                            + "**-shh invite**" + "  Give you a invite link\n"
                            + "**-shh status**" + "  My father info\n"
                            + "\n"
                            + "**Tutorial** \n"
                            + "\n"
                            + "**-sht netcat**" + "  Start it :) \n"
                        )
                        .setTimestampToNow()
                        .setFooter("Shellby Helper")
                        .setColor(new Color(27, 113, 158)))
                    .send(event.getChannel()).join();

            }
            ;
        } else if (config.getBotMenu().equals("default")) {
            if (message.getContent().equalsIgnoreCase("-shh help")) {
                MessageAuthor author = event.getMessage().getAuthor();
                long idSaved = author.getId();


                new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                        .setTitle("**Shellby Helper Menu**")
                        .setDescription("Reverse Shell \uD83D\uDC68\u200D\uD83D\uDCBB \n"
                            + "Restricted Shell \uD83D\uDD0B \n "  //🔋
                            + "Info \u2139\uFE0F  \n"
                            + "Tutorial \uD83E\uDD16 \n"
                        )
                        .setTimestampToNow()
                        .setFooter("Shellby Helper")
                        .setColor(new Color(27, 113, 158)))
                    .send(event.getChannel())
                    .thenAccept(messageNew -> {
                        messageNew.addReactionAddListener(reactionEvent -> {
                            //reaction 👨‍💻 (reverse shell )
                            if (reactionEvent.getEmoji().equalsEmoji("\uD83D\uDC68\u200D\uD83D\uDCBB") &&
                                reactionEvent.getUserId() == idSaved) {
                                reactionEvent.editMessage(new EmbedBuilder()
                                    .setTitle("**Reverse Shell Linux \uD83D\uDC68\u200D\uD83D\uDCBB**")
                                    .setDescription("**-shr bash**" + " - Bash Reverse Shell\n "
                                        + "**-shr java**" + " - Java Reverse Shell\n"
                                        + "**-shr netcat**" + " - Netcat Reverse Shell\n"
                                        + "**-shr ncat**" + " - Ncat Reverse Shell\n"
                                        + "**-shr perl**" + " - Perl Reverse Shell\n"
                                        + "**-shr python**" + " - Pyhon 2.7 UP Reverse Shell\n"
                                        + "**-shr ruby**" + " - Ruby Reverse Shell\n"
                                        + "**-shr telnet**" + " - Telnet Reverse Shell\n" +
                                        "\n")
                                );


                            } else if (reactionEvent.getEmoji().equalsEmoji("\u2139\uFE0F") &&
                                reactionEvent.getUserId() == idSaved) {

                                reactionEvent.editMessage(new EmbedBuilder()
                                    .setTitle("**Info Comands \u2139\uFE0F **")
                                    .setDescription("**-shh invite**" + " - Give you a invite link\n"
                                        + "**-shh status**" + " - Bot info\n" +
                                        "\n")
                                );


                            }

                            //Restricted Shell
                            else if (reactionEvent.getEmoji().equalsEmoji("\uD83D\uDD0B") &&
                                reactionEvent.getUserId() == idSaved) {

                                reactionEvent.editMessage(new EmbedBuilder()
                                    .setTitle("**Restricted Shell  \u2139\uFE0F **")
                                    .setDescription("**-shres python **" + " - #Python Restricted Shell\n"
                                        + "**-shres ruby **" + " -  #Ruby Restricted Shell \n"
                                        + "**-shres lua **" + " - #Lua Restricted Shell\n"
                                        +
                                        "\n")
                                );


                            }
                            // emoji 🤖 to a tutorial
                            else if (reactionEvent.getEmoji().equalsEmoji("\uD83E\uDD16") &&
                                reactionEvent.getUserId() == idSaved) {
                                reactionEvent.editMessage(new EmbedBuilder()
                                    .setTitle("**Tutorials \uD83E\uDD16**")
                                    .setDescription("**-sht netcat**" + " - Netcat Tutorials \n " +
                                        "\n")
                                );

                            }//home button
                            else if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") &&
                                reactionEvent.getUserId() == idSaved) {
                                reactionEvent.editMessage(new EmbedBuilder()
                                    .setTitle("**Shellby Helper Menu**")
                                    .setDescription(
                                        "Reverse shell \uD83D\uDC68\u200D\uD83D\uDCBB  \n "
                                            + "Restricted Shell \uD83D\uDD0B \n" //🔋
                                            + "Info \u2139\uFE0F  \n"
                                            + "Tutorial \uD83E\uDD16 \n")
                                    .setTimestampToNow()
                                    .setFooter("Shellby Helper")
                                    .setColor(new Color(27, 113, 158))
                                );

                            }

                        }).removeAfter(config.getTimeEventerInt(), TimeUnit.MINUTES);

                        messageNew.addReactions("\uD83D\uDC68\u200D\uD83D\uDCBB");  //👨‍💻
                        messageNew.addReaction("\uD83D\uDD0B"); // 🔋
                        messageNew.addReactions("\u2139\uFE0F"); //ℹ️
                        messageNew.addReaction("\uD83E\uDD16"); // 🤖
                        messageNew.addReaction("\uD83C\uDFE0"); // 🏠





                    });
            }
        } else {
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("**ERROR**")
                    .setDescription("No definne shellby menu settings \n"
                    )
                    .setTimestampToNow()
                    .setFooter("Shellby Helper")
                    .setColor(new Color(163, 22, 48)))
                .send(event.getChannel()).join();
            System.err.println("No definne shellby menu settings");
        }
        ;

        if (message.getContent().equalsIgnoreCase("-shh status")) {

            //Uptime
            RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
            updateBots = rb.getUptime();

            String uptimeString = String.format("```%d```", updateBots);

            //embded message
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("**Bot Information**")
                    .addField("**Developer**", "```daskama#2967```", true)
                    .addField("**Bot Version**", "```0.6```", false)
                    .addField("**Java Version**", "```1.8```", false)
                    .addField("**Bot Update **", "```15/11/2020```", true)
                    .addField("**Uptime **", uptimeString, true)
                    .addField("**Source Code Github **",
                        "```https://github.com/hulibrci/ShellByHelper```", true)
                    .setColor(new Color(27, 113, 158)))
                .send(event.getChannel());

        }
        ;


    }
}

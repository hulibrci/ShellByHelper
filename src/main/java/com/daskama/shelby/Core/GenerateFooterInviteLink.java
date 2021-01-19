package com.daskama.shelby.Core;

public class GenerateFooterInviteLink {

    private String output;
    private MainVoid voidinvite;


    /**
     * Footer link pre Shellbyho.
     *
     * @return invite link + paypall
     */
    public String generateFooterInviteLinks() {
        this.voidinvite = new MainVoid();
        this.output = String
            .format("\n\n[Invite Bot](%s) |  [Donate](https://www.paypal.com/paypalme/Hulibrci)\n ",
                this.voidinvite.getInviteLink());
        return this.output;
    }


}

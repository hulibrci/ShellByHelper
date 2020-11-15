package com.Daskama.shelby.Core;

public class GenerateFooterInviteLink {

    private String output;
    MainVoid   voidinvite ;


    public String generateFooterInviteLinks(){
        voidinvite = new MainVoid();
        output = String.format("\n\n[Invite Bot](%s) |  [Donate](https://www.paypal.com/paypalme/Hulibrci)\n ",voidinvite.getInviteUrl());
        return output;
    }



}

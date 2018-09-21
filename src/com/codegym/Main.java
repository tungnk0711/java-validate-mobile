package com.codegym;

public class Main {

    private static MobileExample mobileExample;

    public static final String mobile = "(87)-(0343543434)";


    public static void main(String args[]) {
        mobileExample = new MobileExample();

        boolean isvalid = mobileExample.validate(mobile);
        System.out.println("Mobile is " + mobile + " is valid: " + isvalid);
    }

}


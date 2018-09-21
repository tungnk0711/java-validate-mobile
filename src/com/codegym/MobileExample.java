package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExample {
    private static final String MOBILE_REGEX = "^\\(\\d{2}\\)-\\([0]\\d{9}\\)$";

    public MobileExample() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(MOBILE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

package com.fsoft.codingchallenge.utils;


import static com.fsoft.codingchallenge.constants.Messages.MSG_COMMAND_ERROR;

public class ParseNumberUtils {
    public static int valueOf(String s) {
        int result = -1;
        try {
            result = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println(MSG_COMMAND_ERROR);
        }
        return result;
    }
}

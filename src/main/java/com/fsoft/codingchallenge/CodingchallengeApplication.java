package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.*;
import com.fsoft.codingchallenge.constants.Messages;

public class CodingchallengeApplication {

    public static void main(String[] args) {
        System.out.println(Messages.DESCRIPTION);
        CommandProcessor processor = new CommandProcessor();
        processor.start();
    }

}

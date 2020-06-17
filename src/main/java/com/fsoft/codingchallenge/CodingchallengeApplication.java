package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.*;

public class CodingchallengeApplication {

    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();
        processor.start();
    }

}

package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.CommandProcessor;
import com.fsoft.codingchallenge.exceptions.InvalidCommandArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CommandTest {
    @Test
    public void givenInvalidCommand() {
        assertThrows(InvalidCommandArgumentException.class, () -> new CommandProcessor().validateCommand("123"));
    }
}

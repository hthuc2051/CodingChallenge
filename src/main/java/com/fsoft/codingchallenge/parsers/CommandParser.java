package com.fsoft.codingchallenge.parsers;

import com.fsoft.codingchallenge.commands.DrawingCommand;
import com.fsoft.codingchallenge.exceptions.InvalidCommandArgumentException;

public interface CommandParser<T extends DrawingCommand> {
    T parse(String commandStr) throws InvalidCommandArgumentException;
}

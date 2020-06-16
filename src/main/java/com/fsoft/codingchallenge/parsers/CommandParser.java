package com.fsoft.codingchallenge.parsers;

import com.fsoft.codingchallenge.commands.DrawingCommand;

public interface CommandParser<T extends DrawingCommand> {
    T parse(String commandStr);
}

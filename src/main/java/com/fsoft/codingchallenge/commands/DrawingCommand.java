package com.fsoft.codingchallenge.commands;

import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

public interface DrawingCommand {
    void execute() throws InvalidDrawingComponentException;
}

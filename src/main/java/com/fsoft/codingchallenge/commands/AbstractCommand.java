package com.fsoft.codingchallenge.commands;

import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

public abstract class AbstractCommand implements DrawingCommand{

    protected Canvas canvas;

    public AbstractCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void execute() throws InvalidDrawingComponentException {}
}

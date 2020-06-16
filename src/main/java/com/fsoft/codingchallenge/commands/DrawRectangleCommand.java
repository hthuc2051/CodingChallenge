package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.Rectangle;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

import static com.fsoft.codingchallenge.constants.Messages.MSG_CANVAS_NOT_CREATED;

public class DrawRectangleCommand implements DrawingCommand {
    private final Rectangle rectangle;
    private final Canvas canvas;

    public DrawRectangleCommand(Rectangle rectangle, Canvas canvas) {
        this.rectangle = rectangle;
        this.canvas = canvas;
    }

    public void execute() throws InvalidDrawingComponentException {
        if(canvas == null){
            throw new InvalidDrawingComponentException(MSG_CANVAS_NOT_CREATED);
        }
        canvas.addChildComponent(this.rectangle);
        canvas.draw();
    }
}

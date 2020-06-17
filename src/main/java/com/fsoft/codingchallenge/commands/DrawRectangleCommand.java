package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.Rectangle;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

import static com.fsoft.codingchallenge.constants.Messages.*;

public class DrawRectangleCommand extends AbstractCommand {
    private final Rectangle rectangle;

    public DrawRectangleCommand(Rectangle rectangle, Canvas canvas) {
        super(canvas);
        if (rectangle == null) {
            throw new IllegalArgumentException(MSG_RECTANGLE_NULL);
        }
        this.rectangle = rectangle;
    }

    @Override
    public void execute() throws InvalidDrawingComponentException {
        if(canvas == null){
            throw new InvalidDrawingComponentException(MSG_CANVAS_NOT_CREATED);
        }
        canvas.addChildComponent(this.rectangle);
        canvas.draw();
    }
}

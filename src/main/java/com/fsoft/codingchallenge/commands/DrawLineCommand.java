package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.Line;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

import static com.fsoft.codingchallenge.constants.Messages.MSG_CANVAS_NOT_CREATED;

public class DrawLineCommand implements DrawingCommand {
    private final Line line;
    private final Canvas canvas;

    public DrawLineCommand(Line line, Canvas canvas) {
        this.line = line;
        this.canvas = canvas;
    }

    public void execute() throws InvalidDrawingComponentException {
        if(canvas == null){
            throw new InvalidDrawingComponentException(MSG_CANVAS_NOT_CREATED);
        }
        canvas.addChildComponent(this.line);
        canvas.draw();
    }
}

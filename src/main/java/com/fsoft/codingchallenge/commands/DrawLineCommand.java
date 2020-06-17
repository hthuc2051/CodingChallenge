package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.Line;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

import static com.fsoft.codingchallenge.constants.Messages.MSG_CANVAS_NOT_CREATED;

public class DrawLineCommand extends AbstractCommand{
    private final Line line;

    public DrawLineCommand(Line line, Canvas canvas) {
        super(canvas);
        this.line = line;
    }

    @Override
    public void execute() throws InvalidDrawingComponentException {
        if(canvas == null){
            throw new InvalidDrawingComponentException(MSG_CANVAS_NOT_CREATED);
        }
        canvas.addChildComponent(this.line);
        canvas.draw();
    }
}

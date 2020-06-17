package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.BucketFill;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

import static com.fsoft.codingchallenge.constants.Messages.MSG_CANVAS_NOT_CREATED;

public class BucketFillCommand extends AbstractCommand {

    private final BucketFill bucketFill;

    public BucketFillCommand(BucketFill bucketFill, Canvas canvas) {
        super(canvas);
        this.bucketFill = bucketFill;
    }

    @Override
    public void execute() throws InvalidDrawingComponentException {
        if (canvas == null) {
            throw new InvalidDrawingComponentException(MSG_CANVAS_NOT_CREATED);
        }
        canvas.addChildComponent(this.bucketFill);
        canvas.draw();
    }
}

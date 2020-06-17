package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.BucketFill;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;

import static com.fsoft.codingchallenge.constants.Messages.*;

public class BucketFillCommand extends AbstractCommand {

    private final BucketFill bucketFill;

    public BucketFillCommand(BucketFill bucketFill, Canvas canvas) {
        super(canvas);
        if (bucketFill == null) {
            throw new IllegalArgumentException(MSG_BUCKET_FILL_NULL);
        }
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

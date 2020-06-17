package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.BucketFillCommand;
import com.fsoft.codingchallenge.dtos.Point;
import com.fsoft.codingchallenge.dtos.drawing.BucketFill;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BucketFillCommandTest {

    @Test
    public void givenBucketFillIsNull_when_createBucketFill() {
        BucketFill bucketFill = null;
        assertThrows(IllegalArgumentException.class, () -> new BucketFillCommand(bucketFill, null));
    }

    @Test
    public void givenCanvasIsNull_when_executeCommand() {
        BucketFill bucketFill = new BucketFill(new Point(1,2),'o');
        assertThrows(InvalidDrawingComponentException.class, () -> new BucketFillCommand(bucketFill, null).execute());
    }
}

package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.BucketFillCommand;
import com.fsoft.codingchallenge.dtos.drawing.BucketFill;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BucketFillCommandTest {

    @Test
    public void givenBucketFillIsNull_when_executeCommand() {
        BucketFill bucketFill = null;
        assertThrows(InvalidDrawingComponentException.class, () -> new BucketFillCommand(bucketFill, null).execute());
    }

}

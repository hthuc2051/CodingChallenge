package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.BucketFillCommand;
import com.fsoft.codingchallenge.commands.DrawLineCommand;
import com.fsoft.codingchallenge.dtos.drawing.BucketFill;
import com.fsoft.codingchallenge.dtos.drawing.Line;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrawLineCommandTest {

    @Test
    public void givenIsNull_when_executeCommand() {
        Line line = null;
        assertThrows(InvalidDrawingComponentException.class, () -> new DrawLineCommand(line, null).execute());
    }
}

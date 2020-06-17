package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.DrawLineCommand;
import com.fsoft.codingchallenge.commands.DrawRectangleCommand;
import com.fsoft.codingchallenge.dtos.drawing.Line;
import com.fsoft.codingchallenge.dtos.drawing.Rectangle;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrawRectangleCommandTest {

    @Test
    public void givenIsNull_when_executeCommand() {
        Rectangle rectangle = null;
        assertThrows(InvalidDrawingComponentException.class, () -> new DrawRectangleCommand(rectangle, null).execute());
    }
}

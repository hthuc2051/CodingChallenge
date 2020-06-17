package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.DrawRectangleCommand;
import com.fsoft.codingchallenge.dtos.Point;
import com.fsoft.codingchallenge.dtos.drawing.Rectangle;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrawRectangleCommandTest {

    @Test
    public void givenRectangleIsNull_when_createRectangle() {
        Rectangle rectangle = null;
        assertThrows(IllegalArgumentException.class, () -> new DrawRectangleCommand(rectangle, null));
    }
    @Test
    public void givenCanvasIsNull_when_executeCommand() {
        Rectangle rectangle = new Rectangle(new Point(1,2),new Point(3,4));
        assertThrows(InvalidDrawingComponentException.class, () -> new DrawRectangleCommand(rectangle, null).execute());
    }
}

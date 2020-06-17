package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.DrawLineCommand;
import com.fsoft.codingchallenge.dtos.Point;
import com.fsoft.codingchallenge.dtos.drawing.Line;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrawLineCommandTest {

    @Test
    public void givenLineIsNull_when_createDrawLineCommand() {
        Line line = null;
        assertThrows(IllegalArgumentException.class, () -> new DrawLineCommand(line, null));
    }
    @Test
    public void givenCanvasIsNull_when_executeCommand() {
        Line line = new Line(new Point(1,2),new Point(3,4));
        assertThrows(InvalidDrawingComponentException.class, () -> new DrawLineCommand(line, null).execute());
    }

}

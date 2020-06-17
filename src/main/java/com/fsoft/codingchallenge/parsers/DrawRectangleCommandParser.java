package com.fsoft.codingchallenge.parsers;

import com.fsoft.codingchallenge.commands.DrawRectangleCommand;
import com.fsoft.codingchallenge.dtos.drawing.Rectangle;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.dtos.Point;
import com.fsoft.codingchallenge.exceptions.InvalidCommandArgumentException;
import com.fsoft.codingchallenge.utils.ParseNumberUtils;

import static com.fsoft.codingchallenge.constants.AppConstant.CHARACTER_SPLIT;
import static com.fsoft.codingchallenge.constants.Messages.MSG_ARGUMENT_MAX_LENGTH;
import static com.fsoft.codingchallenge.constants.Messages.MSG_COMMAND_ERROR;

public class DrawRectangleCommandParser implements CommandParser {

    private static final int COMMAND_ARGUMENT_LENGTH = 5;
    private final Canvas canvas;

    public DrawRectangleCommandParser(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public DrawRectangleCommand parse(String commandStr) throws InvalidCommandArgumentException {
        DrawRectangleCommand drawRectangleCommand = null;
        String[] arr = commandStr.split(CHARACTER_SPLIT);
        if (arr.length == COMMAND_ARGUMENT_LENGTH) {

            int x1 = ParseNumberUtils.valueOf(arr[1]);
            int y1 = ParseNumberUtils.valueOf(arr[2]);

            int x2 = ParseNumberUtils.valueOf(arr[3]);
            int y2 = ParseNumberUtils.valueOf(arr[4]);

            Point start = new Point(x1, y1);
            Point end = new Point(x2, y2);
            Rectangle rectangle = new Rectangle(start, end);

            drawRectangleCommand = new DrawRectangleCommand(rectangle, canvas);
        } else {
            throw new InvalidCommandArgumentException(MSG_ARGUMENT_MAX_LENGTH + COMMAND_ARGUMENT_LENGTH);
        }
        return drawRectangleCommand;
    }
}

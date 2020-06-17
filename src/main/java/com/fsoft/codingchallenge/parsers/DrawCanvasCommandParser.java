package com.fsoft.codingchallenge.parsers;

import com.fsoft.codingchallenge.commands.DrawCanvasCommand;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.dtos.Dimension;
import com.fsoft.codingchallenge.utils.ParseNumberUtils;

import static com.fsoft.codingchallenge.constants.AppConstant.CHARACTER_SPLIT;
import static com.fsoft.codingchallenge.constants.Messages.MSG_CANVAS_CREATED;


public class DrawCanvasCommandParser implements CommandParser {

    private static final int COMMAND_ARGUMENT_LENGTH = 3;
    private Canvas canvas;


    @Override
    public DrawCanvasCommand parse(String commandStr) {
        DrawCanvasCommand canvasCommand = null;
        String[] arr = commandStr.split(CHARACTER_SPLIT);
        if (arr.length == COMMAND_ARGUMENT_LENGTH) {

            int width = ParseNumberUtils.valueOf(arr[1]);
            int height = ParseNumberUtils.valueOf(arr[2]);

            Dimension dimension = new Dimension(width, height);
            if (canvas == null) {
                canvas = new Canvas(dimension);
            } else {
                throw new IllegalArgumentException(MSG_CANVAS_CREATED);
            }
            canvasCommand = new DrawCanvasCommand(canvas);
        }
        return canvasCommand;
    }

    public Canvas getCanvas() {
        return this.canvas;
    }
}

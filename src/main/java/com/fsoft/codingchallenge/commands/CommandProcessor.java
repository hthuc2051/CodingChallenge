package com.fsoft.codingchallenge.commands;

import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.exceptions.InvalidCommandArgumentException;
import com.fsoft.codingchallenge.parsers.BucketFillCommandParser;
import com.fsoft.codingchallenge.parsers.DrawCanvasCommandParser;
import com.fsoft.codingchallenge.parsers.DrawLineCommandParser;
import com.fsoft.codingchallenge.parsers.DrawRectangleCommandParser;

import java.util.Scanner;

import static com.fsoft.codingchallenge.constants.AppConstant.*;
import static com.fsoft.codingchallenge.constants.Messages.*;

public class CommandProcessor {

    private boolean isRunning = true;
    private Canvas canvas;

    public void start() {

        char prefix;

        do {
            System.out.print(MSG_ENTER);
            Scanner sc = new Scanner(System.in);
            String inputCommand = sc.nextLine();
            try {
                prefix = validateCommand(inputCommand);
                switch (prefix) {
                    case PREFIX_CANVAS:
                        DrawCanvasCommandParser canvasCommandParser = new DrawCanvasCommandParser();
                        DrawCanvasCommand drawCanvasCommand = canvasCommandParser.parse(inputCommand);
                        canvas = canvasCommandParser.getCanvas();
                        drawCanvasCommand.execute();

                        break;
                    case PREFIX_LINE:
                        DrawLineCommandParser drawLineCommandParser = new DrawLineCommandParser(canvas);
                        DrawLineCommand drawLineCommand = drawLineCommandParser.parse(inputCommand);
                        drawLineCommand.execute();

                        break;
                    case PREFIX_RECTANGLE:
                        DrawRectangleCommandParser drawRectangleCommandParser = new DrawRectangleCommandParser(canvas);
                        DrawRectangleCommand drawRectangleCommand = drawRectangleCommandParser.parse(inputCommand);
                        drawRectangleCommand.execute();

                        break;
                    case PREFIX_BUCKET_FILL:
                        BucketFillCommandParser bucketFillCommandParser = new BucketFillCommandParser(canvas);
                        BucketFillCommand bucketFillCommand = bucketFillCommandParser.parse(inputCommand);
                        bucketFillCommand.execute();

                        break;
                    case PREFIX_QUIT:
                        isRunning = false;
                        System.out.println(MSG_QUIT);

                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (isRunning);
    }


    public char validateCommand(String inputString) throws InvalidCommandArgumentException {
        String[] arr = inputString.split(CHARACTER_SPLIT);
        String prefix = arr[0];

        if (prefix.equalsIgnoreCase(String.valueOf(PREFIX_CANVAS)))
            return PREFIX_CANVAS;
        else if (prefix.equalsIgnoreCase(String.valueOf(PREFIX_LINE)))
            return PREFIX_LINE;
        else if (prefix.equalsIgnoreCase(String.valueOf(PREFIX_RECTANGLE)))
            return PREFIX_RECTANGLE;
        else if (prefix.equalsIgnoreCase(String.valueOf(PREFIX_BUCKET_FILL)))
            return PREFIX_BUCKET_FILL;
        else if (inputString.equalsIgnoreCase(String.valueOf(PREFIX_QUIT)))
            return PREFIX_QUIT;
        else {
            throw new InvalidCommandArgumentException(MSG_COMMAND_ERROR);
        }
    }

}

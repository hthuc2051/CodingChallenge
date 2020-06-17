package com.fsoft.codingchallenge.parsers;

import com.fsoft.codingchallenge.commands.BucketFillCommand;
import com.fsoft.codingchallenge.dtos.drawing.BucketFill;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import com.fsoft.codingchallenge.dtos.Point;
import com.fsoft.codingchallenge.exceptions.InvalidCommandArgumentException;
import com.fsoft.codingchallenge.utils.ParseNumberUtils;

import static com.fsoft.codingchallenge.constants.AppConstant.CHARACTER_SPLIT;
import static com.fsoft.codingchallenge.constants.Messages.MSG_ARGUMENT_MAX_LENGTH;
import static com.fsoft.codingchallenge.constants.Messages.MSG_COMMAND_ERROR;

public class BucketFillCommandParser implements CommandParser {

    private static final int COMMAND_ARGUMENT_LENGTH = 4;
    private final Canvas canvas;

    public BucketFillCommandParser(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public BucketFillCommand parse(String commandStr) throws InvalidCommandArgumentException {

        BucketFillCommand bucketFillCommand = null;
        String[] arr = commandStr.split(CHARACTER_SPLIT);

        if (arr.length == COMMAND_ARGUMENT_LENGTH) {

            int x1 = ParseNumberUtils.valueOf(arr[1]);
            int y1 = ParseNumberUtils.valueOf(arr[2]);
            char color = arr[3].charAt(0);

            Point fillPoint = new Point(x1, y1);
            BucketFill bucketFill = new BucketFill(fillPoint, color);

            bucketFillCommand = new BucketFillCommand(bucketFill, canvas);
        } else {
            throw new InvalidCommandArgumentException(MSG_ARGUMENT_MAX_LENGTH + COMMAND_ARGUMENT_LENGTH);
        }
        return bucketFillCommand;
    }
}
package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.Canvas;

public class DrawCanvasCommand extends AbstractCommand {

    public DrawCanvasCommand(Canvas canvas) {
        super(canvas);
    }

    public void execute() {
        canvas.draw();
    }
}

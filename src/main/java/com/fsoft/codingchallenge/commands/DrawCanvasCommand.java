package com.fsoft.codingchallenge.commands;


import com.fsoft.codingchallenge.dtos.drawing.Canvas;

public class DrawCanvasCommand implements DrawingCommand {

    private final Canvas canvas;

    public DrawCanvasCommand(Canvas canvas) {
        this.canvas = canvas;
    }

    public void execute() {
        canvas.draw();
    }
}

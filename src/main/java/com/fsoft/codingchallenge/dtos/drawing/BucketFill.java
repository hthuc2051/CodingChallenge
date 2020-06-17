package com.fsoft.codingchallenge.dtos.drawing;

import com.fsoft.codingchallenge.dtos.Dimension;
import com.fsoft.codingchallenge.dtos.Point;

public class BucketFill implements DrawableComponent {

    private Point point;
    private char color;

    public BucketFill(Point point, char color) {
        this.point = point;
        this.color = color;
    }

    @Override
    public void draw(Canvas canvas) {
        char target = canvas.get(this.point.getY(), this.point.getX());

        this.fill(canvas, target, this.color, this.point.getY(), this.point.getX());
    }

    private void fill(Canvas canvas, char target, char replacement, int row, int column) {
        if (target == replacement) {
            return;
        }

        char ch = canvas.get(row, column);

        if (ch != target) {
            return;
        }

        canvas.update(row, column, replacement);

        if (checkBoundaries(canvas.getDimension(), column, row + 1)) {
            fill(canvas, ch, replacement, row + 1, column);
        }

        if (checkBoundaries(canvas.getDimension(), column, row - 1)) {
            fill(canvas, ch, replacement, row - 1, column);
        }

        if (checkBoundaries(canvas.getDimension(), column - 1, row)) {
            fill(canvas, ch, replacement, row, column - 1);
        }

        if (checkBoundaries(canvas.getDimension(), column + 1, row)) {
            fill(canvas, ch, replacement, row, column + 1);
        }
    }

    public boolean checkBoundaries(Dimension dimension, int x, int y) {

        return 1 <= x && 1 <= y
                && 1 + dimension.getWidth() >= x
                && 1 + dimension.getHeight() >= y;
    }

    public Point getPoint() {
        return point;
    }

    public char getColor() {
        return color;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setColor(char color) {
        this.color = color;
    }
}

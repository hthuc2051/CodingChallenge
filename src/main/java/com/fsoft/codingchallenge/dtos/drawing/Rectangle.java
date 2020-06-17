package com.fsoft.codingchallenge.dtos.drawing;

import com.fsoft.codingchallenge.dtos.Point;

import static com.fsoft.codingchallenge.constants.AppConstant.CHARACTER;
import static com.fsoft.codingchallenge.constants.Messages.MSG_POINT_END_NULL;
import static com.fsoft.codingchallenge.constants.Messages.MSG_POINT_START_NULL;

public class Rectangle implements DrawableComponent  {

    private Point start;
    private Point end;

    public Rectangle(Point start, Point end) {

        if (start == null) {
            throw new IllegalArgumentException(MSG_POINT_START_NULL);
        }

        if (end == null) {
            throw new IllegalArgumentException(MSG_POINT_END_NULL);
        }

        this.start = start;
        this.end = end;
    }

    @Override
    public void draw(Canvas canvas) {
        int sx = Math.min(this.start.getX(), this.end.getX());
        int ex = Math.max(this.start.getX(), this.end.getX());
        int sy = Math.min(this.start.getY(), this.end.getY());
        int ey = Math.max(this.start.getY(), this.end.getY());

        for (int i = sx; i <= ex; i++) {
            canvas.update(sy, i, CHARACTER);
            canvas.update(ey, i, CHARACTER);
        }

        for (int i = sy + 1; i < ey; i++) {
            canvas.update(i, sx, CHARACTER);
            canvas.update(i, ex, CHARACTER);
        }
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
}

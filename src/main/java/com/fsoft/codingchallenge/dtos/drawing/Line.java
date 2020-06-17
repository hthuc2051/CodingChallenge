package com.fsoft.codingchallenge.dtos.drawing;

import static com.fsoft.codingchallenge.constants.AppConstant.*;
import static com.fsoft.codingchallenge.constants.Messages.MSG_POINT_END_NULL;
import static com.fsoft.codingchallenge.constants.Messages.MSG_POINT_START_NULL;

import com.fsoft.codingchallenge.dtos.Point;

public class Line implements DrawableComponent {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
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
        if (this.start.getX() == this.end.getX()) {
            int sy = Math.min(this.start.getY(), this.end.getY());
            int ey = Math.max(this.start.getY(), this.end.getY());

            for (int i = sy; i <= ey; i++) {
                canvas.update(i, this.start.getX(), CHARACTER);
            }
        } else {
            int sx = Math.min(this.start.getX(), this.end.getX());
            int ex = Math.max(this.start.getX(), this.end.getX());

            for (int i = sx; i <= ex; i++) {
                canvas.update(this.start.getY(), i, CHARACTER);
            }
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

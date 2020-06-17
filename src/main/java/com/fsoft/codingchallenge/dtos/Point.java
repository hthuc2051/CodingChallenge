package com.fsoft.codingchallenge.dtos;




public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        super();

        if (x < 0) {
            throw new IllegalArgumentException("x must be a positive integer >= 0");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y must be a positive integer >= 0");
        }

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

package com.fsoft.codingchallenge.dtos;



public class Dimension {

    private int width;
    private int height;

    public Dimension() {
    }

    public Dimension(int width, int height) {
        super();

        if (width < 0) {
            throw new IllegalArgumentException("Width must be a positive integer >= 0");
        }

        if (height < 0) {
            throw new IllegalArgumentException("Height must be a positive integer >= 0");
        }

        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

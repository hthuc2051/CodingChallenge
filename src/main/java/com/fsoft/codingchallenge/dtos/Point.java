package com.fsoft.codingchallenge.dtos;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Point {
    private int x;
    private int y;

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
}

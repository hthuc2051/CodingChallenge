package com.fsoft.codingchallenge.dtos;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dimension {

    private int width;
    private int height;

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
}

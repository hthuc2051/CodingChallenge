package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.dtos.Dimension;
import com.fsoft.codingchallenge.dtos.drawing.Canvas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CanvasTest {
    @Test
    public void givenDimensionIsNull_when_createCanvas() {
        assertThrows(IllegalArgumentException.class, () -> new Canvas(null));
    }

    @Test
    public void givenDimensionContainsWidthAndHeightGraterThanMaxValue_when_createCanvas() {
        Dimension dimension = new Dimension(99,99);
        assertThrows(IllegalArgumentException.class, () -> new Canvas(dimension));
    }

}

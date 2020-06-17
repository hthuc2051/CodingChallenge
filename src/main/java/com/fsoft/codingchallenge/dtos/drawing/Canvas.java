package com.fsoft.codingchallenge.dtos.drawing;

import com.fsoft.codingchallenge.dtos.Dimension;
import com.fsoft.codingchallenge.dtos.drawing.DrawableComponent;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static com.fsoft.codingchallenge.constants.AppConstant.*;
import static com.fsoft.codingchallenge.constants.Messages.*;


public class Canvas {
    private Dimension dimension;
    private Dimension outerDimension;
    private final char[][] cells;
    private List<DrawableComponent> components;

    public Canvas(Dimension dimension) {

        if (dimension == null) {
            throw new IllegalArgumentException(MSG_DIMENSION_NULL);
        }

        if (dimension.getWidth() <= 0 || dimension.getWidth() > MAX_WIDTH)
            throw new IllegalArgumentException(MSG_INVALID_CANVAS_WIDTH + dimension.getWidth());

        if (dimension.getHeight() <= 0 || dimension.getHeight() > MAX_HEIGHT)
            throw new IllegalArgumentException(MSG_INVALID_CANVAS_HEIGHT + dimension.getHeight());

        this.dimension = dimension;
        this.outerDimension = new Dimension(this.dimension.getWidth() + 2, this.dimension.getHeight() + 2);
        this.cells = new char[outerDimension.getHeight()][outerDimension.getWidth()];

    }

    public void addChildComponent(DrawableComponent component){
        if(this.components == null){
            this.components = new ArrayList<>();
        }
        if (!this.components.contains(component)) {
            this.components.add(component);
        }
    }

    public void update(int row, int column, char value) {
        cells[row][column] = value;
    }

    public char get(int row, int column) {
        return cells[row][column];
    }

    private void setValue() {
        for (int i = 0; i < outerDimension.getHeight(); i++) {
            for (int j = 0; j < outerDimension.getWidth(); j++) {
                if (i == 0 || i == outerDimension.getHeight() - 1) {
                    this.update(i, j, HORIZONTAL_CHARACTER);
                } else if (j == 0 || j == outerDimension.getWidth() - 1) {
                    this.update(i, j, VERTICAL_CHARACTER);
                } else {
                    this.update(i, j, CELL_CHARACTER);
                }
            }
        }
    }

    public void draw() {
        setValue();

        if(components != null){
            this.components.forEach(component -> component.draw(this));
        }

        for (int i = 0; i < this.outerDimension.getHeight(); i++) {
            for (int j = 0; j < this.outerDimension.getWidth(); j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Dimension getOuterDimension() {
        return outerDimension;
    }

    public void setOuterDimension(Dimension outerDimension) {
        this.outerDimension = outerDimension;
    }

    public char[][] getCells() {
        return cells;
    }

    public List<DrawableComponent> getComponents() {
        return components;
    }

    public void setComponents(List<DrawableComponent> components) {
        this.components = components;
    }
}

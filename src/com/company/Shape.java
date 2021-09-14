package com.company;

import java.util.Arrays;

public class Shape {
    private int color;
    private Params[] vertices;
    public Shape(int color, Params[] vertices){
        this.color = color;
        this.vertices = vertices;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Params[] getVertices() {
        return vertices;
    }

    public void setVertices(Params[] vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", vertices=" + Arrays.toString(vertices) +
                '}';
    }
}

package com.example.catnip;

public abstract class Shape {

    protected int x;
    protected int y;
    protected String color;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "blue";
    }
}

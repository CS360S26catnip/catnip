package com.example.catnip;

public class Rectangle extends Shape {
    private int Area;

    public Rectangle(int x, int y, int Area) {
        super(x, y);
        Area = x * y;
    }
}
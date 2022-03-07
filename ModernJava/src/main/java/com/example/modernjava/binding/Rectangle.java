package com.example.modernjava.binding;

public class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int newx, int newy, int newwidth, int newheight) {
        super(newx, newy);
        setWidth(newwidth);
        setHeight(newheight);
    }

    int getWidth() { return width; }
    int getHeight() { return height; }
    void setWidth(int newwidth) { width = newwidth; }
    void setHeight(int newheight) { height = newheight; }

    void draw() {
        System.out.println("Drawing a Rectangle at:(" + getX() + ", " + getY() +
                "), width " + getWidth() + ", height " + getHeight());
    }
}

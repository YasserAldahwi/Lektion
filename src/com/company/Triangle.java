package com.company;

public class Triangle implements Figure{
    protected int height;
    protected int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return height*base/2;
    }
    protected double lengthOffSide(){
        return Math.sqrt(base/2*base/2)+height*height;

    }
    @Override
    public double getCircumference() {
        return base+2*lengthOffSide();
    }
}

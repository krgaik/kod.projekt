package com.kod.testing.shape;

public class Circle implements Shape {
    private double r;
    private double pi = 3.14;

    public Circle(double r) {
        this.r = r;
        //this.pi = 3.14;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return pi * r * r;
    }

    public double getR() {
        return r;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public String toString() {
        return "Circle{"  +
                getField() +'}' ;
    }
}

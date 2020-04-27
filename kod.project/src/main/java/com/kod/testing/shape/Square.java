package com.kod.testing.shape;

public class Square implements Shape {
    private double a;

    @Override
    public String
    toString() {
        return "Square{" +
                "a=" + a + " " + getField() +
                '}';
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a*a;
    }

    public double getA() {
        return a;
    }
}

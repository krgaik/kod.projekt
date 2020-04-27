package com.kod.testing.shape;

public class Main {
    public static void main(String[] args) {
        ShapeCollector kolo = new ShapeCollector();
        kolo.addFigure(new Circle(5));

        System.out.println(kolo.showFigures());
    }
}

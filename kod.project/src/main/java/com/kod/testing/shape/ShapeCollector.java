package com.kod.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> list = new ArrayList<Shape>();


    public void addFigure(Shape shape){
        this.list.add(shape);
    }

    public void removeFigure(Shape shape){
        this.list.remove(shape);
    }

    public Shape getFigure(int n){
        return list.get(n);
    }

    public List<Shape> getList() {
        return list;
    }

    public void setList(List<Shape> list) {
        this.list = list;
    }

    public String showFigures(){
        return list.toString();
    }
}

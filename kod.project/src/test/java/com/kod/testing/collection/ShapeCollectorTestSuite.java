package com.kod.testing.collection;

import com.kod.testing.shape.Circle;
import com.kod.testing.shape.Shape;
import com.kod.testing.shape.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddShape(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.0);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1,shapeCollector.getList().size());
    }
    @Test
    public void testRemoveShape(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0,shapeCollector.getList().size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
        shapeCollector.addFigure(circle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(Circle.class, result.getClass());

    }
    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals("Circle{" +
                circle.getField() +'}',circle.toString());
    }


}

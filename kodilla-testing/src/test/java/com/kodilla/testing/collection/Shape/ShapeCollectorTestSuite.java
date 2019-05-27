package com.kodilla.testing.collection.Shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10,11);

        shapeCollector.addFigure(triangle);

        Assert.assertEquals(1,shapeCollector.showFigures().size());
    }
    @Test
    public void testRemoveFigureNotExist(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10,11);

        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertFalse(result);

    }
    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10,11);
        shapeCollector.addFigure(triangle);

        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.showFigures().size());
    }
    @Test
public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10,11);

        shapeCollector.addFigure(triangle);

        Shape retrievedShape = shapeCollector.getFigure(0);

        Assert.assertEquals(triangle, retrievedShape);
    }
    @Test
    public void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10,11);

        shapeCollector.addFigure(triangle);

        System.out.println(shapeCollector.showFigures());

        Assert.assertEquals(1, shapeCollector.showFigures().size());
    }
}

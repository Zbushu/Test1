package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);

    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;

    }
    public Shape getFigure(int n){
        Shape shape = shapes.get(n);
        return shape;
    }
    public ArrayList<Shape> showFigures() {
        return shapes;
    }

}

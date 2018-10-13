package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();
    public Shape addShape(Shape shape){
        shapes.add(shape);
        return shape;
    }
    public Shape removeShape(Shape shape){
        shapes.remove(shape);
        return shape;
    }
    public Shape getShape(int index){
        return shapes.get(index);
    }


}

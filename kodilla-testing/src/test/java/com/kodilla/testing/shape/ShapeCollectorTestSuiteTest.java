package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;


public class ShapeCollectorTestSuiteTest {

    @Test
    public void testAddShape() {
        ShapeCollector list = new ShapeCollector();
        Shape figure1 = new Triangle();
        list.addShape(figure1);
        Shape figure2 = new Square();
        list.addShape(figure2);
        Shape figure3 = new Circle();
        list.addShape(figure3);

        Shape a1 = list.addShape(figure1);
        Assert.assertEquals(figure1, a1.getShapename());
    }

    @Test
    public void testRemoveShape() {
        ShapeCollector list2 = new ShapeCollector();
        Shape figure1 = new Triangle();
        list2.removeShape(figure1);
        Shape figure2 = new Square();
        list2.removeShape(figure2);
        Shape figure3 = new Circle();
        list2.removeShape(figure3);

        Shape a2 = list2.removeShape(figure1);
        Assert.assertEquals(figure1, a2.getShapename());
    }

    @Test
    public void testGetShape() {
        ShapeCollector list3 = new ShapeCollector();
        list3.getShape(1);
        list3.getShape(2);
        list3.getShape(3);

        Shape a3 = list3.getShape(2);
        Assert.assertEquals(2, a3.getShapename());
    }
}



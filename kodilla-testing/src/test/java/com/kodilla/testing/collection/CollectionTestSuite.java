package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Test
    public void addShapes() {
       //Given
        ArrayList<Integer> theList = new ArrayList<>();

        OddNumbersExterminator one = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList = one.exterminate(theList);
        //Then
        Assert.assertEquals(0,resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(12);
        theList.add(9);
        theList.add(15);
        theList.add(16);
        theList.add(50);
        OddNumbersExterminator one = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList = one.exterminate(theList);
        //Then
        Assert.assertEquals(3,resultList.size());
    }

}

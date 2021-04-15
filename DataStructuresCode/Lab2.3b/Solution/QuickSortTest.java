package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class QuickSortTest {

    @Test
    public void sortPositive() {
        int[] unsortedArray = {3, 7, 2, 15, 8, 4, 6, 5, 1};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        new QuickSort().sort(unsortedArray);
        for (int a=0; a<unsortedArray.length; a++){
            assertEquals(sortedArray[a], unsortedArray[a]);
        }
    }

    @Test
    public void sortDupPivotPositive() {
        int[] unsortedArray = {3, 7, 2, 15, 8, 1, 4, 6, 5, 1};
        int[] sortedArray = {1, 1, 2, 3, 4, 5, 6, 7, 8, 15};
        new QuickSort().sort(unsortedArray);
        for (int a=0; a<unsortedArray.length; a++){
            assertEquals(sortedArray[a], unsortedArray[a]);
        }
    }

    @Test
    public void sortAnyDupPositive() {
        int[] unsortedArray = {3, 7, 2, 15, 8, 7, 4, 6, 5, 1};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 7, 8, 15};
        new QuickSort().sort(unsortedArray);
        for (int a=0; a<unsortedArray.length; a++){
            assertEquals(sortedArray[a], unsortedArray[a]);
        }
    }

    @Test
    public void sortNullArrayPositive() {
        int[] unsortedArray = null;
        String expectedMessage = "Null array";
        try{
            new QuickSort().sort(unsortedArray);
            fail("Exception not thrown");
        }
        catch (InvalidParameterException ipe){
            String actualMessage = ipe.getMessage();
            assertEquals(expectedMessage, actualMessage);
        }
    }

    @Test
    public void sortEmptyArrayPositive() {
        int[] unsortedArray = {};
        new QuickSort().sort(unsortedArray);
        try{
            new QuickSort().sort(unsortedArray);
        }
        catch (Exception e){
            fail("Exception thrown");
        }
    }
}
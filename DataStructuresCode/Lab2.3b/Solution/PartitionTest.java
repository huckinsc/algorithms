package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionTest {


    @Test
    public void partitionPositive() {
        int[] array = {2, 5, 4, 1, 3};
        int expectedPivot = 3;
        Partition.partition(array, 0, 4);
        assertEquals(expectedPivot, array[2]);
    }

    @Test
    public void partitionPositiveSortedIncreasing() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedPivot = 5;
        Partition.partition(array, 0, 4);
        assertEquals(expectedPivot, array[4]);
    }

    @Test
    public void partitionPositiveSortedDecreasing() {
        int[] array = {5, 4, 3, 2, 1};
        int expectedPivot = 1;
        Partition.partition(array, 0, 4);
        assertEquals(expectedPivot, array[0]);    }

    @Test
    public void partitionPositiveNegativePivot() {
    }

    @Test
    public void partitionNegativeNullArray(){

    }

    @Test
    public void swap() {
    }
}
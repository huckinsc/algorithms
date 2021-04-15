import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void sortTest(){
        int size = 150000;
        int[] a = new Random().ints(size,1, 20).toArray();
        QuickSort quickSort = new QuickSort();
        quickSort.sortArray(a);
        System.out.println(String.format("Sorted %,d items in %,d(ns) and %,d swaps",size,quickSort.getDuration(),quickSort.getCounter()));
    }

    @Test
    public void sortTest2(){
        int size = 1500;
        int[] a = new Random().ints(size,1, 20).toArray();
        QuickSort quickSort = new QuickSort();
        quickSort.sortArray(a);
        System.out.println(String.format("Sorted %,d items in %,d(ns) and %,d swaps",size,quickSort.getDuration(),quickSort.getCounter()));
    }

}
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {
    private int[] x;

    @Before
    public void createLargeArray(){
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++){
            a[i] = 10000-i;
        }
        x = a;
    }

    @Test
    public void sort1WithUnsortedArray(){
        System.out.println("\n** sort1WithUnsortedArray **");
        int[] a = {10,9,8,7,6,5,4,3,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort1(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort1 took %,d nanoseconds with sortred array", duration));
        assertEquals(0,Arrays.compare(new int[]{1,2,3,4,5,6,7,8,9,10}, a));
    }

    @Test
    public void sort2WithUnsortedArray(){
        System.out.println("\n** sort2WithUnsortedArray **");
        int[] a = {10,9,8,7,6,5,4,3,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort2(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort2 took %,d nanoseconds with unsortred array", duration));
        assertEquals(0,Arrays.compare(new int[]{1,2,3,4,5,6,7,8,9,10}, a));
    }

    @Test
    public void sort3WithUnsortedArray(){
        System.out.println("\n** sort3WithUnsortedArray **");
        int[] a = {10,9,8,7,6,5,4,3,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort3(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort3 took %,d nanoseconds with unsortred array", duration));
        assertEquals(0,Arrays.compare(new int[]{1,2,3,4,5,6,7,8,9,10}, a));
    }

    @Test
    public void sort1WithSortedArray(){
        System.out.println("\n** sort1WithSortedArray **");
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort1(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort1 took %,d nanoseconds with sortred array", duration));
        assertEquals(0,Arrays.compare(new int[]{1,2,3,4,5,6,7,8,9,10}, a));
    }

    @Test
    public void sort2WithSortedArray(){
        System.out.println("\n** sort2WithSortedArray **");
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort2(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort2 took %,d nanoseconds with sortred array", duration));
        assertEquals(0,Arrays.compare(new int[]{1,2,3,4,5,6,7,8,9,10}, a));
    }

    @Test
    public void sort3WithSortedArray(){
        System.out.println("\n** sort3WithSortedArray **");
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort3(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort3 took %,d nanoseconds with sortred array", duration));
        assertEquals(0,Arrays.compare(new int[]{1,2,3,4,5,6,7,8,9,10}, a));
    }

    @Test
    public void sort1WithLargeArray(){
        System.out.println("\n** sort1WithLargeArray **");
        int[] a = Arrays.copyOf(x,10000);
        int[] b = Arrays.copyOf(x,10000);
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort1(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort1 took %,d nanoseconds with large unsortred array", duration));
        Arrays.sort(b);
        assertEquals(0,Arrays.compare(b, a));
    }

    @Test
    public void sort2WithLargeArray(){
        System.out.println("\n** sort2WithLargeArray **");
        int[] a = Arrays.copyOf(x,10000);
        int[] b = Arrays.copyOf(x,10000);
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort2(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort2 took %,d nanoseconds with large unsortred array", duration));
        Arrays.sort(b);
        assertEquals(0,Arrays.compare(b, a));
    }

    @Test
    public void sort3WithLargeArray(){
        System.out.println("\n** sort3WithLargeArray **");
        int[] a = Arrays.copyOf(x,10000);
        int[] b = Arrays.copyOf(x,10000);
        BubbleSort bubbleSort = new BubbleSort();
        long startTime =  System.nanoTime();
        bubbleSort.bubbleSort3(a);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Sort3 took %,d nanoseconds with large unsortred array", duration));
        Arrays.sort(b);
        assertEquals(0,Arrays.compare(b, a));
    }
}
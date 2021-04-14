import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchRecursiveTest {
    private int[] arr;
    private int[] largeArr;

    @Before
    public void createArray() {
        int[] temp = new int[100];
        for (int i = 0; i < 100; i++) {
            temp[i] = (i + 1) * 2;
        }
        arr = temp;

        int[] temp2 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            temp2[i] = (i + 1) * 2;
        }
        largeArr = temp2;
    }

    @Test
    public void foundTest() {
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        assertTrue(binarySearchRecursive.search(14, arr));
        System.out.println(String.format("Found in %,d iterations in %,d (ns),", binarySearchRecursive.getCounter(),binarySearchRecursive.getDuration()));
    }

    @Test
    public void notFoundTest() {
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        assertFalse(binarySearchRecursive.search(21, arr));
        System.out.println(String.format("Not found in %,d iterations in %,d (ns).", binarySearchRecursive.getCounter(),binarySearchRecursive.getDuration()));
    }

    @Test
    public void foundTest_large() {
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        assertTrue(binarySearchRecursive.search(14, largeArr));
        System.out.println(String.format("(large)Found in %,d iterations in %,d (ns).", binarySearchRecursive.getCounter(),binarySearchRecursive.getDuration()));
    }

    @Test
    public void notFoundTest_large() {
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        assertFalse(binarySearchRecursive.search(21, largeArr));
        System.out.println(String.format("(large)Not found in %,d iterations in %,d (ns).", binarySearchRecursive.getCounter(),binarySearchRecursive.getDuration()));
    }
}
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void testMergeSort(){
        MergeSort mergeSort = new MergeSort();
        int[] a = {4,6,2,7,90,1,3,45,1,4534,123,-1};
        mergeSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
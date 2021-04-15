package com.account;
import java.util.Arrays;
public class QuickSort {
    public void sort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private void sort(int[] numbers, int start, int end) {
        // if the start value is less than the end value
        // (this will not be true when we are at the deepest recursion)
        // 1. call the partition method, passing in numbers, start and end, and getting back the int position of the pivot
        // 2. print the partitions, using numbers and the position of the pivot from partition( )
        // 3. call this method (recursion) on the lower partition of numbers (from start to pivot-1)
        // 4. call this method (recursion) on the higher partition of number (from pivot+1 to end)
    }

    private void printPartitions(int[] numbers, int pivot){
        for (int a=0; a<pivot; a++){
            System.out.print(numbers[a] + " ");
        }
        System.out.print("   " + numbers[pivot] + "    ");
        for (int a=pivot+1; a<numbers.length; a++){
            System.out.print(numbers[a] + " ");
        }
        System.out.println("\n");
    }

    private int partition(int[] numbers, int start, int end) {
        // get the value at the pivot (at array index "end"
        // start a variable called "top" just below the start
        // "top" will represent the top of the lower partition
        // iterate from start to end...each time:
        //  1. if the current array element is less than the pivot
        //      a. increment "top" by 1
        //      b. swap the two numbers at the "top" position and the current array index
        // once the loop is over, swap the values at index "top" with the last iteration position
        // this will move the pivot at the end of the array to the top position
        // finally, return the top value + 1
        // this will become the position of the new pivot for the next recursion
    }

    private void swap(int[] numbers, int j, int k) {
        // initialize a temporary int variable with the value at numbers[j]
        // copy the value at position j with the value at position k
        // copy the value in the temporary variable into numbers[k]
    }


    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
//        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0, 9, 3, 6};
        int[] numbers = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}

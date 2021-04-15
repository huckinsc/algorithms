package com.algorithms;
import java.security.InvalidParameterException;
import java.util.Arrays;
public class QuickSort {
    public void sort(int[] numbers){
        if (numbers!=null) {
            sort(numbers, 0, numbers.length - 1);
        }
        else{
            throw new InvalidParameterException("Null array");
        }
    }
    private void sort(int[] numbers, int start, int end) {
        if (start < end) {
            int p = Partition.partition(numbers, start, end);
            printPartitions(numbers, p);
            sort(numbers, start, p - 1);
            sort(numbers, p + 1, end);
        }
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

//    private int partition(int[] numbers, int start, int end) {
//        int pivot = numbers[end];
//        int x = start - 1;
//        for (int i = start; i < end; i++) {
//            if (numbers[i] < pivot) {
//                x++;
//                swap(numbers, x, i);
//            }
//        }
//        swap(numbers, x + 1, end);
//        return x + 1;
//    }
//
//    private void swap(int[] numbers, int j, int k) {
//        int temp = numbers[j];
//        numbers[j] = numbers[k];
//        numbers[k] = temp;
//    }


    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
//        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0, 9, 3, 6};
        int[] numbers = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}

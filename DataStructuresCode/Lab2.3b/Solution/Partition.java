package com.algorithms;

public class Partition {
    public static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int top = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < pivot) {
                top++;
                swap(numbers, top, i);
            }
        }
        swap(numbers, top + 1, end);
        return top + 1;
    }

    public static void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }
}

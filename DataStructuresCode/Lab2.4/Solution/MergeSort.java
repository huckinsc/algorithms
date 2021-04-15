package com.algorithms;

import java.security.InvalidParameterException;

public class MergeSort {

    public void mergeSort(int[] array) {
        if (array!=null) {
            mergeSort(array, 0, array.length - 1);
        }
        else{
            throw new InvalidParameterException("Null array");
        }
    }

    private void mergeSort(int[] array, int start, int end) {
//    pseudo code:
//        mergeSort(array, start, end)

        if( start<end) {
            int middle = (end-start)/2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
//           merge(array, start, middle, end)
        }

    }

    private void merge(int[] array, int start, int middle, int end) {
        int lowerArrayIndex = start;
        int upperArrayIndex = middle+1;
        int[] arrayTemp = new int[(end-start)+1];
        for (int tempIndex = 0; tempIndex<arrayTemp.length; tempIndex++){
            if (lowerArrayIndex<= middle && (upperArrayIndex>end || array[lowerArrayIndex] <= array[upperArrayIndex])){
                arrayTemp[tempIndex] = array[lowerArrayIndex];
                lowerArrayIndex++;
            }
            else{
                arrayTemp[tempIndex] = array[upperArrayIndex];
                upperArrayIndex++;
            }
        }
        System.arraycopy(arrayTemp, 0, array, start, arrayTemp.length);
//    pseudo code:
//        merge(array, start, middle, end)
//        i = start
//        upperArrayIndex = middle + 1
//        arrayTemp = initArrayOfSize(end - start + 1)
//        for (k = 0 until (end of arrayTemp))
//             if (i <= middle && (upperArrayIndex > end || array[i] <= array[upperArrayIndex]))
//                 arrayTemp[k] = array[i]
//                 i++
//	           else
//                  arrayTemp[k] = array[upperArrayIndex]
//                  upperArrayIndex++
//        copyArray(arrayTemp, array, start)

    }

    public static void printArray(int[] array){
        for(int num: array) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {15, 7, 12, 4, 17, 9, 5, 6};
        printArray(array);
        MergeSort sorter = new MergeSort();
        System.out.println();
        new MergeSort().mergeSort(array);
        printArray(array);

    }
}

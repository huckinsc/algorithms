import java.util.Arrays;

class BubbleSort {
    public void bubbleSort1(int[] arr){
        int arrayLength = arr.length;
        int counter = 0;
        for (int k = 1; k < arrayLength; k++){
            for (int j = 0; j < arrayLength - 1; j++){
                counter++;
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                }
            }
        }
        System.out.println(String.format("bubbleSort1 made %,d comparisons.",counter));
    }

    public void bubbleSort2(int[] arr){
        int counter = 0;
        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < arr.length - i; j++){
                counter++;
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(String.format("bubbleSort2 made %,d comparisons.",counter));
    }

    public void bubbleSort3(int[] arr){
        int counter = 0;
        int i = 0;
        boolean swapOccurred = true;
        while (swapOccurred){
            swapOccurred = false;
            i++;
            for (int j = 0; j < arr.length - i; j++){
                counter++;
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapOccurred = true;
                }
            }
        }
        System.out.println(String.format("bubbleSort3 made %,d comparisons.",counter));
    }
}
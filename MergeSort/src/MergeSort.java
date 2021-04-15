import java.util.Arrays;

public class MergeSort {
    int counter = 0;
    long duration = 0;

    public void sort(int[] array){
        sort(array, 0, array.length -1);
    }

    private void sort(int[] array, int start, int end){
        if (start < end){
            int midPoint = (end - start) / 2 + start;
            sort(array,start,midPoint);
            sort(array,midPoint+1,end);
            merge(array,start,midPoint,end);
        }
    }

    private void merge(int[] array, int start, int middle, int end){
        int i = start;
        int j = middle + 1;
        int[] arrayTemp = new int[end - start + 1];
        for (int k = 0; k <= (end - start); k++){
            if (i <= middle && (j > end || array[i] <= array[j])){
                arrayTemp[k] = array[i];
                i++;
            }
            else{
                arrayTemp[k] = array[j];
                j++;
            }
        }
        for (int s = start, x = 0; x < arrayTemp.length; x++,s++){
            array[s] = arrayTemp[x];
        }
    }
}
public class QuickSort {
    private int counter = 0;
    private long duration = 0;

    private void swap(int[] numbers,int pos1,int pos2){
        int temp = numbers[pos1];
        numbers[pos1] = numbers[pos2];
        numbers[pos2] = temp;
        counter++;
    }

    private int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int x = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < pivot) {
                x++;
                swap(numbers, x, i);
            }
        }
        swap(numbers, x+1,end);
        return x+1;
    }

    private void sort(int[] numbers,int start, int end){
        if (start < end){
            int p = partition(numbers,start,end);
            sort(numbers,start, p - 1);
            sort(numbers,p+1,end);
        }
    }

    public void sortArray(int[] array){
        counter = 0;
        long startTime = System.nanoTime();
        sort(array,0,array.length-1);
        long endTime = System.nanoTime();
        duration = endTime - startTime;
    }

    public int getCounter(){
        return counter;
    }

    public long getDuration() {
        return duration;
    }
}
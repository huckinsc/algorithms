class BinarySearchRecursive {
    private int counter = 0;
    private long duration = 0;

    public boolean search(int value, int[] array){
        counter = 0;
        long startTime = System.nanoTime();
        boolean result =  binarySearchRecursive(value,array,0,array.length-1);
        long endTime = System.nanoTime();
        duration = endTime - startTime;
        return result;
    }

    private boolean binarySearchRecursive(int value, int[] array, int start, int end){
        counter++;
        if (start <= end){
            int midpoint = (end - start) / 2 + start;
            if (array[midpoint]  == value){
                return true;
            }
            if (array[midpoint] > value){
                return binarySearchRecursive(value,array,start, midpoint - 1);
            }
            return binarySearchRecursive(value,array,start + 1, end);
        }
        return false;
    }

    public int getCounter(){
        return counter;
    }

    public long getDuration() {
        return duration;
    }
}
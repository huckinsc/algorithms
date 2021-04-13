import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastIntersection {
    public List<Integer> intersection(int[] a, int[] b){
        List<Integer> result = new ArrayList<>(a.length);
        Arrays.sort(a);
        Arrays.sort(b);
        long counter = 0;
        int aPointer = 0;
        int bPointer = 0;
        while (aPointer != a.length-1 && bPointer != b.length -1){
            if (a[aPointer] < b[bPointer]){
                aPointer++;
            }
            else if (a[aPointer] > b[bPointer]){
                bPointer++;
            }
            if (a[aPointer] == b[bPointer]){
                result.add(a[aPointer]);
                aPointer++;
                bPointer++;
            }
            counter++;
        }
        System.out.println(String.format("Fast Intersection took %,d iterations.",counter));
        return result;
    }

    public static void main(String[] args) {
        FastIntersection fastIntersection = new FastIntersection();
        System.out.println(fastIntersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
    }

}
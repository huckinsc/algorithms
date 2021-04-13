import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTests {
    @Test
    public void testSimple(){
        SimpleIntersection simpleIntersection = new SimpleIntersection();
        long startTime =  System.nanoTime();
        System.out.println(simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("SimpleIntersect took %,d nanoseconds", duration));
    }

    @Test
    public void testFast(){
        FastIntersection fastIntersection = new FastIntersection();
        long startTime =  System.nanoTime();
        System.out.println(fastIntersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("FastIntersect took %,d nanoseconds", duration));
    }

    @Test
    public void testSimple2(){
        SimpleIntersection simpleIntersection = new SimpleIntersection();
        long startTime =  System.nanoTime();
        System.out.println(simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3,11,13,15,19,24,25,28,36,34,48,69,70,71,80,82,87},
                new int[]{4, 7, 5, 2, 3,11,13,15,19,24,25,28,36,34,48,69,70,71,80,82,87}));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Large SimpleIntersect took %,d nanoseconds", duration));
    }

    @Test
    public void testFast2(){
        FastIntersection fastIntersection = new FastIntersection();
        long startTime =  System.nanoTime();
        System.out.println(fastIntersection.intersection(new int[]{4, 7, 5, 2, 3,11,13,15,19,24,25,28,36,34,48,69,70,71,80,82,87},
                new int[]{4, 7, 5, 2, 3,11,13,15,19,24,25,28,36,34,48,69,70,71,80,82,87}));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Large FastIntersect took %,d nanoseconds", duration));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testNotPrime(){
        long startTime =  System.nanoTime();
        Main.primeFactors(2100078578);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Large not prime took %,d nanoseconds", duration));
    }

    @Test
    public void testPrime(){
        long startTime =  System.nanoTime();
        Main.primeFactors(2100078577);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(String.format("Large prime took %,d nanoseconds", duration));
    }
}
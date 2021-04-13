import java.util.*;

class Main {
    public static void main(String[] args) {

    }

    static List<Long> primeFactors(long x){
        long originalNumber = x;
        List<Long> result = new ArrayList<>();
        long factor = 2;
        long counter = 0;
        while (x > 1){
            counter++;
            if (x % factor == 0){
                result.add(factor);
                x /= factor;
            }
            else{
                factor += 1;
            }
        }
        System.out.println(String.format("Number: %,d took %,d iterations",originalNumber,counter));
        return result;
    }
}
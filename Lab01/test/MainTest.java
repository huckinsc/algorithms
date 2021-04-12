import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test1(){
        assertEquals(7,Main.convertBinToDecimal("111"));
        assertEquals(3,Main.convertBinToDecimal("11"));
        assertEquals(1,Main.convertBinToDecimal("1"));
    }

    @Test
    void test2(){
        assertEquals(1,Main.convertOctToDecimal("1"));
        assertEquals(9,Main.convertOctToDecimal("11"));
        assertEquals(17,Main.convertOctToDecimal("21"));
        assertEquals(81,Main.convertOctToDecimal("121"));
        assertEquals(302,Main.convertOctToDecimal("456"));
        assertEquals(19246,Main.convertOctToDecimal("45456"));
    }

    @Test
    void test3(){
        assertEquals(1,Main.convertOctToDecimalUsingRecursion("1"));
        assertEquals(9,Main.convertOctToDecimalUsingRecursion("11"));
        assertEquals(17,Main.convertOctToDecimalUsingRecursion("21"));
        assertEquals(81,Main.convertOctToDecimalUsingRecursion("121"));
        assertEquals(302,Main.convertOctToDecimalUsingRecursion("456"));
        assertEquals(19246,Main.convertOctToDecimalUsingRecursion("45456"));
    }

}
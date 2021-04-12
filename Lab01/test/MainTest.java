import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void conBin_0_shouldReturn_0() {
        assertEquals(0,Main.convertBinToDecimal("0"));
    }

    @Test
    public void conBin_1_shouldReturn_1() {
        assertEquals(1,Main.convertBinToDecimal("1"));
    }

    @Test
    public void conBin_10_shouldReturn_2() {
        assertEquals(2,Main.convertBinToDecimal("10"));
    }
    @Test
    public void conBin_1001_shouldReturn_9() {
        assertEquals(9,Main.convertBinToDecimal("1001"));
    }

    @Test
    public void conBin_11111111_shouldReturn_255() {
        assertEquals(255,Main.convertBinToDecimal("11111111"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void conBin_acb_shouldThrowException() {
        Main.convertBinToDecimal("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void conBin_123_shouldThrowException() {
        Main.convertBinToDecimal("123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void conBin_1F_shouldThrowException() {
        Main.convertBinToDecimal("1F");
    }

    @Test
    public void conOct_0_shouldReturn_0() {
        assertEquals(0,Main.convertOctToDecimalUsingRecursion("0"));
    }

    @Test
    public void conOct_1_shouldReturn_1() {
        assertEquals(1,Main.convertOctToDecimalUsingRecursion("1"));
    }

    @Test
    public void conOct_10_shouldReturn_8() {
        assertEquals(8,Main.convertOctToDecimalUsingRecursion("10"));
    }

    @Test
    public void conOct_654_shouldReturn_10() {
        assertEquals(428,Main.convertOctToDecimalUsingRecursion("654"));
    }

    @Test
    public void conOct_701654_shouldReturn_230316() {
        assertEquals(230316,Main.convertOctToDecimalUsingRecursion("701654"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void conOct_814_shouldThrowException() {
        Main.convertOctToDecimalUsingRecursion("814");
    }

    @Test(expected = IllegalArgumentException.class)
    public void conOct_abc_shouldThrowException() {
        Main.convertOctToDecimalUsingRecursion("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void conOct_1A_shouldThrowException() {
        Main.convertOctToDecimalUsingRecursion("1A");
    }
}
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DigiPowTest {

    @Test
    public void solvesFor89() {
        assertEquals(1, DigiPow.digPow(89, 1));
    }

    @Test
    public void splitsNumberIntoSingleDigit() {
        assertEquals(Arrays.asList(1), DigiPow.digitize(1));
    }

    @Test
    public void splitsIntoMultipleDigits() {
        assertEquals(Arrays.asList(1, 2), DigiPow.digitize(12));
    }

    @Test
    public void splitsIntoThreeDigits() {
        assertEquals(Arrays.asList(1, 2, 3), DigiPow.digitize(123));
    }

    @Test
    public void splitsIntoManyDigits() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), DigiPow.digitize(12345678));
    }

    @Test
    public void returnsEightyNine() {
        List<Integer> digits = new ArrayList<>();
        digits.add(8);
        digits.add(9);
        assertEquals((89), DigiPow.toThePowerOf(digits, 1));
    }

    @Test
    public void returnsNinetyTwo() {
        List<Integer> digits = new ArrayList<>();
        digits.add(6);
        digits.add(9);
        digits.add(5);
        assertEquals((1390), DigiPow.toThePowerOf(digits, 2));
    }

    @Test
    public void returnsIntermediateNumber() {
        List<Integer> digits = new ArrayList<>();
        digits.add(4);
        digits.add(6);
        digits.add(2);
        digits.add(8);
        digits.add(8);
        assertEquals((2360688), DigiPow.toThePowerOf(digits, 3));
    }

    @Test
    public void SixhundredAndNinetyFive() {
        assertEquals((2), DigiPow.digiPowed(1390, 695),0);
    }

    @Test
    public void OneHundredAndEightyFour() {
        assertEquals((-1), DigiPow.digPow(287, 1),0);
    }
    @Test
    public void NinetyTwo() {
        assertEquals((-1), DigiPow.digPow(92, 1),0);
    }

    @Test
    public void FortySixThousandTwoHundredAndEightyEight() {
        assertEquals((51), DigiPow.digiPowed(2360688, 46288), 0);
    }

    @Test
    public void testsFinal() {
        assertEquals((51), DigiPow.digPow(46288, 3));
    }

    @Test
    public void returnsNegativeOneForNinetyTwo() {
        assertEquals((-1), DigiPow.digPow(92, 1));
    }

}


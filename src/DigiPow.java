import java.util.ArrayList;
import java.util.List;

public class DigiPow {

    public static int digPow(int n, int p) {
        List<Integer> digitizedNumber = digitize(n);
        int digitizedNumbers = toThePowerOf(digitizedNumber, p);
        double magicNumber = digiPowed(digitizedNumbers, n);
        if (magicNumber <= 0 || (int) magicNumber != magicNumber) {
            return -1;
        }
        int magicNumberFinal = (int) magicNumber;
        return magicNumberFinal;
    }

    public static List<Integer> digitize(int number) {
        List<Integer> digits = new ArrayList<>();
        int digit = number % 10;
        int remainingDigits = number / 10;
        if (remainingDigits != 0) {
            digits.addAll(digitize(remainingDigits));
        }
        digits.add(digit);
        return digits;
    }

    public static int toThePowerOf(List<Integer> digits, int p) {
        int result = 0;
        for (int i = 0; i < digits.size(); i++) {
            result += (int) Math.pow(digits.get(i), i + p);
        }
        return result;
    }


    public static double digiPowed(int result, int n) {
        //System.out.println(result);
        //System.out.println(n);
        double magicNumber =  result / (double)n;
        return magicNumber;
    }
}


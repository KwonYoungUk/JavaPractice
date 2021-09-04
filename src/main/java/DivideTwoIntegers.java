import java.util.ArrayList;
import java.util.List;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        DivideTwoIntegersSolution s = new DivideTwoIntegersSolution();
        s.divide(7, -3);
    }
}

class DivideTwoIntegersSolution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1 || dividend == 0) {
            return dividend;
        }

        if (divisor == -1 && dividend == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }

        boolean isNegativeDividend = dividend < 0;
        boolean isNegativeDivisor = divisor < 0;

        int a = isNegativeDividend ? dividend : -dividend;
        int b = isNegativeDivisor ? divisor : -divisor;
        int result = divideNegatives(a, b);

        return isNegativeDividend != isNegativeDivisor ? -result : result;
    }

    private int divideNegatives(int a, int b) {
        int c = 0;
        while (a <= b) {
            a -= b;
            c++;
        }
        return c;
    }
}



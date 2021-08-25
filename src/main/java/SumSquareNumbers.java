public class SumSquareNumbers {
    public static void main(String[] args) {
        SumSquareNumbersSolution s = new SumSquareNumbersSolution();
        s.judgeSquareSum(999999999);
    }
}

class SumSquareNumbersSolution {
    public boolean judgeSquareSum(int c) {
        boolean result = false;

        int left = 0;
        int right = (int) Math.ceil(Math.sqrt(c));

        while (left <= right) {
            double squareValue = ((double)left * (double)left) + ((double)right * (double)right);
            if (squareValue > c) {
                right--;
                continue;
            } else if(squareValue < c) {
                left++;
                continue;
            } else {
                result = true;
                break;
            }
        }

        return result;
    }
}

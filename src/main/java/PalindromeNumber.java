public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumberSolution s = new PalindromeNumberSolution();
        s.isPalindrome(121);
    }
}

class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        boolean result = true;

        if (x < 0) {
            return false;
        } else {
            String strVal = String.valueOf(x);
            int left = 0;
            int right = strVal.length() - 1;

            while(left <= right) {
                if (strVal.charAt(left) == strVal.charAt(right)) {
                    left++;
                    right--;
                    continue;
                } else {
                    return false;
                }
            }
        }

        return result;
    }
}


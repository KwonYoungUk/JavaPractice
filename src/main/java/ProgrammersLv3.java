public class ProgrammersLv3 {
    public static void main(String[] args) {
        PRL3 p = new PRL3();
        int test = p.solution("abcba");
        int t = 100;
    }
}

class PRL3
{
    public int solution(String s)
    {
        int answer = 0;
        int left = 0;

        while (left < s.length() - 1) {
            inner : for(int i = s.length() - 1; i > left; i--) {
                String subStr = s.substring(left, i + 1);
                if (answer > subStr.length()) {
                    break inner;
                }
                if (isPalindrome(subStr)) {
                    answer = Math.max(answer, subStr.length());
                    break inner;
                }
            }
            left++;
        }

        return answer;
    }

    public boolean isPalindrome(String s) {
        boolean result = true;

        if (s.length() <= 1) {
            return false;
        } else {
            for (int i = 0; i <= s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}

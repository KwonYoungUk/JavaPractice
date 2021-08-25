import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhone {
    public static void main(String[] args) {
        LetterCombinationsPhoneSolution s = new LetterCombinationsPhoneSolution();
        s.letterCombinations("23");
    }
}

class LetterCombinationsPhoneSolution {
    public List<String> result;
    public String[] digitsLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        result = new ArrayList<String>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        dfs(0, digits, new StringBuilder());

        return result;
    }

    public void dfs(int index, String digits, StringBuilder sb) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        char ch = digits.charAt(index);
        String str = digitsLetters[ch - '0'];

        for(char c : str.toCharArray()) {
            sb.append(c);
            dfs(index + 1, digits, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}


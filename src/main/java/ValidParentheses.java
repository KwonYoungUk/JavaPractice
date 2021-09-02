import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParenthesesSolution s = new ValidParenthesesSolution();
        boolean result = s.isValid("()}");
        int x = 010;
    }
}

class ValidParenthesesSolution {
    public boolean isValid(String s) {
        boolean result = false;
        String openBracket = "({[";
        String closeBracket = ")}]";
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()) {
            if (openBracket.indexOf(c) >= 0) {
                st.push(c);
            } else if (closeBracket.indexOf(c) >= 0) {
                if (st.isEmpty()) {
                    return false;
                } else {
                    if (c == ')' && st.peek() == '(' || c == '}' && st.peek() == '{' || c == ']' && st.peek() == '[') {
                        st.pop();
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }

        if (st.isEmpty()) {
            result = true;
        }

        return result;
    }
}


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strArr = {"","b"};
        LongestCommonPrefixSolution s = new LongestCommonPrefixSolution();
        s.longestCommonPrefix(strArr);
    }
}

class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        String shortestStr = "";
        boolean isSetted = false;
        for(String st : strs) {
            if (!isSetted) {
                shortestStr = st;
                isSetted = true;
            } else {
                if (st.length() < shortestStr.length()) {
                    shortestStr = st;
                }
            }
        }

        String commonPrefix = "";
        for (int i = 0; i < shortestStr.length(); i++) {
            for(String str : strs) {
                if(str.charAt(i) != shortestStr.charAt(i)) {
                    return commonPrefix;
                }
            }
            commonPrefix = shortestStr.substring(0, i + 1);
        }

        return commonPrefix;
    }
}

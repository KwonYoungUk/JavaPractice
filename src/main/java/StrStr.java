public class StrStr {
    public static void main(String[] args) {
        StrStrSolution s = new StrStrSolution();
        s.strStr("hello", "ll");
    }
}

class StrStrSolution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

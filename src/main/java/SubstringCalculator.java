import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SubstringCalculator {
	public static void main(String[] args) throws IOException {
        long result = substringCalculator("kincenvizh");
    }
	
	public static long substringCalculator(String s) {
		long result = 0l;
		Set<String> substrSet = new HashSet<String>();
		
		putSubstring(s, substrSet);
		result = substrSet.size();
		return result;
    }
	
	public static void putSubstring(String s, Set<String> substrSet) {
		if (!substrSet.contains(s)) {
			substrSet.add(s);
			if (s.length() > 1) {
				putSubstring(s.substring(1, s.length()), substrSet);
				putSubstring(s.substring(0, s.length() - 1), substrSet);
			}
		}
	}
}

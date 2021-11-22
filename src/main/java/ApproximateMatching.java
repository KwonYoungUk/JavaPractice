import java.io.IOException;

public class ApproximateMatching {
	public static void main(String[] args) throws IOException {
		String result = calculateScore("mississippi", "promise", "piccolo");
	}

	public static String calculateScore(String text, String prefixString, String suffixString) {
		String result = "";

		int prefixScore = 0;
		int suffixScore = 0;
		int maxScore = 0;
		String prefix = "";
		String suffix = "";
		String subString = "";
		int left = 0;
		int right = text.length();

		while (true) {
			if (left > right) {
				break;
			}

			subString = text.substring(left, right);

			int preIndex = 0;
			int sufIndex = 0;
			
			while (true) {
				if (subString.startsWith(prefixString.substring(0 + preIndex, prefixString.length()))) {
            		prefix = prefixString.substring(0 + preIndex, prefixString.length());
					break;
				} else {
					preIndex++;
				}
			}
			
			while (true) {
				if (subString.endsWith(suffixString.substring(0, suffixString.length() - sufIndex))) {
					suffix = suffixString.substring(0, suffixString.length() - sufIndex);
					break;
				} else {
					sufIndex++;
				}
			}
			
			prefixScore = prefix.length();
			suffixScore = suffix.length();
			if (maxScore < prefixScore + suffixScore) {
				maxScore = prefixScore + suffixScore;
				if (prefixScore == 0) {
					result = suffix;
				} else if (suffixScore == 0) {
					result = prefix;
				} else {
					result = subString;	
				}
			}
			
			if (suffixScore > prefixScore) {
				left++;
			} else {
				right--;
			}
		}

		return result;
	}
}

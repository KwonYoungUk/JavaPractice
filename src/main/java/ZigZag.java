import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    public static void main(String[] args) {
        ZigZagSolution s = new ZigZagSolution();
        s.convert("PAYPALISHIRING", 3);
    }
}

class ZigZagSolution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        } else {
            List<StringBuilder> sbList = new ArrayList<StringBuilder>();

            for(int i = 0; i < Math.min(numRows, s.length()); i++) {
                sbList.add(new StringBuilder());
            }

            boolean moveBottom = true;
            int currentRow = 0;
            for(int i = 0; i < s.toCharArray().length; i++) {
                sbList.get(currentRow).append(s.toCharArray()[i]);
                if (currentRow >= numRows - 1) {
                    moveBottom = false;
                }
                if (currentRow == 0) {
                    moveBottom = true;
                }

                currentRow = moveBottom ? currentRow + 1 : currentRow - 1;
            }

            String result = "";
            for (StringBuilder sb : sbList) {
                result += sb.toString();
            }
            return result;
        }
    }
}


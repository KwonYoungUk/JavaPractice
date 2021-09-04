import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElementsSolution s = new RemoveElementsSolution();
        int[] nums = {1, 1, 2};
        s.removeElement(nums, 1);
    }
}

class RemoveElementsSolution {
    public int removeElement(int[] nums, int val) {
        List<Integer> numList = new ArrayList<Integer>();
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == val) {
                continue;
            } else {
                numList.add(nums[i]);
                result++;
            }
        }

        for(int i = 0; i < numList.size(); i++) {
            nums[i] = numList.get(i);
        }

        return result;
    }
}


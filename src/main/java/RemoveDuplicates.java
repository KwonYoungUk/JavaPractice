import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicatesSolution s = new RemoveDuplicatesSolution();
        int[] nums = {1, 1, 2};
        s.removeDuplicates(nums);
    }
}

class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        List<Integer> numList = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            if (numList.contains(nums[i])) {
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


import java.util.ArrayList;
import java.util.List;

public class SearchRange {
    public static void main(String[] args) {
        SearchRangeSolution s = new SearchRangeSolution();
        int[] nums = {5,7,7,8,8,10};
        s.searchRange(nums, 8);
    }
}

class SearchRangeSolution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int left = 0;
        int right = nums.length - 1;
        boolean plusLeft = true;
        boolean minusRight = true;

        while(left <= right) {
            if (nums[left] == target && result[0] < 0) {
                result[0] = left;
                plusLeft = false;
            }
            if (nums[right] == target && result[1] < 0) {
                result[1] = right;
                minusRight = false;
            }

            if (result[0] >= 0 && result[1] >= 0) {
                break;
            } else {
                left += plusLeft ? 1 : 0;
                right -= minusRight ? 1 : 0;
            }
        }

        return result;
    }
}

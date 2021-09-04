public class SearchInsert {
    public static void main(String[] args) {
        SearchInsertSolution s = new SearchInsertSolution();
        int[] nums = {1,3};
        int result = s.searchInsert(nums, 2);
        int x = 100;
    }
}

class SearchInsertSolution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (target <= nums[left]) {
                return left;
            } else if (target > nums[right]) {
                return right + 1;
            } else if (target == nums[right]) {
                return right;
            }

            if (right - left == 1) {
                return right;
            }

            left++;
            right--;
        }

        return result;
    }
}

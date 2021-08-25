public class TwoSum {
    public static void main(String[] args) {
        TwoSumSolution s = new TwoSumSolution();
        int[] arrs = {2,7,11,15};
        s.twoSum(arrs, 9);
    }
}

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}

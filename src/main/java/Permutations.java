import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	public static void main(String args[]) {
		PermutationsSolution s = new PermutationsSolution();
		int[] nums = {1, 2, 3};
		s.permute(nums);
	}
}


class PermutationsSolution {
	List<List<Integer>> resultList = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> permute(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) { 
			list.add(nums[i]);
		}
		getResultList(list, new ArrayList<Integer>());
        return resultList;
    }
	
	public void getResultList(List<Integer> nums, List<Integer> numsList) {
		if (nums.size() == 1) {
			numsList.add(nums.get(0));
			resultList.add(new ArrayList<Integer>(numsList));
			numsList.remove(numsList.size() - 1);
			return;
		} else {
			for (int i = 0; i < nums.size(); i++) {
				List<Integer> numsCloneList = new ArrayList<Integer>(nums);
				numsCloneList.remove(i);
				
				/* subList 를 이용해 재귀함수 호출*/
				numsList.add(nums.get(i));
				getResultList(numsCloneList, numsList);
				numsList.remove(numsList.size() - 1);
			}	
		}
    }
}
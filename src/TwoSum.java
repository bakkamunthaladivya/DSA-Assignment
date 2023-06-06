import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	    public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	        int[] ans = new int[2];
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(target - nums[i])) {
	                ans[0] = map.get(target - nums[i]);
	                ans[1] = i;
	                return ans;
	            }
	            map.put(nums[i], i);
	        }
	        return ans;
	    }
	

	public static void main(String[] args) {
		
		int[] nums= {1,8,3,7,9};
		int target=9;
		int[] ans=twoSum(nums,target);
    	
    	System.out.println(Arrays.toString(ans));
    	
	}

	
}
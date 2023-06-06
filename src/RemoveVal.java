public class RemoveVal {
	static int remove(int[] nums, int val) {
		int count=0;
		int[] result;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				count++;
			}
		}
		return count;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,2,3};
		int val=3;
		int count=remove(nums,val);
    	System.out.println(count);
	}

}
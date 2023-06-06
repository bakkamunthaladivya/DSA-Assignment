import java.util.Arrays;

public class MoveZeroes {

	static int[] move(int[] nums) {
		int p=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[p]=nums[i];
				p++;
			}
		}
		while(p<nums.length) {
			nums[p]=0;
			p++;
		}
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,0,4,9,0,4};
		int[] ans=move(nums);
		System.out.println(Arrays.toString(ans));
		

	}

}
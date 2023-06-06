import java.util.Arrays;

public class MergeArrays {
	public static int[] merge(int[] nums1,int n,int[] nums2,int m) {
		
		int i=n-1;
		int j=m-1;
		int k=(n+m-1);
		while(i>=0 && j>=0) {
			if(nums1[i] > nums2[j]) {
				nums1[k]=nums1[i];
				k--;i--;
			}
			else {
				nums1[k]=nums2[j];
				k--;j--;	
			}
		}
		
	
		return nums1;
	}
	public static void main(String[] args) {
		
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		int m=nums2.length;
		int n=nums1.length-m;
		
		int[] ans=merge(nums1,n,nums2,m);
		System.out.println(Arrays.toString(ans));
	}

}
package java_crazy;

public class Solution88 {
	public void merge(int[] nums1, int m, int[] nums2, int n){
		int len1 = m-1, len2= n-1, lenTotal =m+n-1;
		
		while(len1>=0 && len2>=0){
			if(nums1[len1] >= nums2[len2]){
				nums1[lenTotal--] = nums1[len1--];
			}else{
				nums1[lenTotal--] = nums2[len2--];
			}
		}
		//就是nums2还有剩余的元素
		if (len1 ==-1){
			while(len2>=0){
				nums1[lenTotal--] =nums2[len2--];
			}	
		}		
	}
}
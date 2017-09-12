package java_crazy;
/*这道题也可以出成比较普遍的情况：删除一个数组里的重复发元素
*方法：先排个序，再用下面的办法。。。
题目：
Given a sorted array, remove the duplicates in place such that each element appear 
only once and return the new length.
Do not allocate extra space for another array, you must do this in place 
with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2,
with the first two elements of nums being 1 and 2 respectively. 
It doesn't matter what you leave beyond the new length.

题目大意
这道题的要求是在有序数组中删除重复元素，使每个数字出现且只出现1次，并返回数组的新的长度。
要求：不允许申请额外空间，即要求恒定的空间复杂度。

解题思路
这道题的思路就是采用两个指针index和i，index记录不重复元素的位置，i从index的下一个开始遍历数组，
如果i位置的数字等于index位置的数字，说明该数字重复出现，不予处理；
如果i位置的数字不等于index位置的数字，说明该数字没有重复，需要放到index的下一位置，并使index加1。

 * 
 */

public class Solution{
	public int removeDuplicates(int[] nums){
		//如果数组nums的长度为0,那么就返回0;
		if (nums.length==0){
			return 0;
		}
		//设置一个指针,指向数组中第一个元素
		int index =0;
		//从数组第二个数开始，如果nums[i]不等于nums[index]的话，那么就让nums[i]覆盖index后面的一个数。
		for (int i=1;i<nums.length;i++){
			if(nums[index]!=nums[i]){
				//最骚的就是这个for循环里，如果重复，那就直接跳过。。。不作任何处理。
				//nums[++index]=nums[i];
				//上面一行的式子写成下面的式子容易理解
				nums[index+1]=nums[i];
				index++;
			}
		}
		return index+1;		
	}
	//测试用例
	public static void main(String[] args){
		int[] nums ={1,1,2,2,2,2,3,4,4,5,5,6,7,8};
		Solution sol =new Solution();
		System.out.println(sol.removeDuplicates(nums));
	}
}




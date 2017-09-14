public class Solution {
    public int SearchInsert(int[] nums, int target){
        int index = 0;//定义一个指针变量，最后返回它
        if(nums.length == 0){
            index = 0;
        }else if(target<=nums[0]){//target小于等于有序数组中的第一个元素
            index=0;        //其实这个可以和上面那个条件合并，用||
        }else if(target>nums[nums.length-1]){//第一个坑是要减去1，因为length返回的是长度
            index=nums.length;//第二个坑是target大于有序数组中的最后一个元素，千万不能大于等于！
        }else for(int i=0; i<nums.length-1;i++){//这个有个坑，要减1，否则下面的i+1就越界了
            if((target>nums[i]) && (target<=nums[i+1])){
                index =i+1;
            }
        }
        return index;
    }
    public static void main(String[] args){//测试用例
        int[] nums ={1,6,8,20,39};
        Solution sol = new Solution();
        System.out.println("这个数应该在这个数组的 "+sol.SearchInsert(nums,28)+" 位置");
    }
}
//下面是二分查找的思路
/*public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
        }//调用下面私有的binartSearch方法。
    private int binarySearch(int[] nums, int target, int left, int right) {
        // TODO Auto-generated method stub
        if(left > right)
            return -1;
        if(left == right){
            if(nums[left] >= target){
                return left;
                }else{
                    return right+1;
                    }
            }
        int mid = (left + right)/2;
        if(target < nums[mid]){
            return binarySearch(nums,target,left,mid);
            }else if(target == nums[mid]){
                return mid;
                }else{
                    return binarySearch(nums,target,mid+1,right);
                    }
        }
    public static void main(String[] args){
        int[] nums ={1};
        Solution35 sol = new Solution35();
        System.out.println("这个数应该在这个数组的 "+sol.searchInsert(nums,1)+" 位置");
    }
}*/


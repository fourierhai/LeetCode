package java_crazy;

public class No27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int index=0;
        
        for(int i=0; i<nums.length; i++){
            if( val!= nums[i]){
                nums[index++]=nums[i];
                //index++;自己错在这里（没有上一行，只写了这一行），
                //这只是一个计数器，虽然只需要返回index，但是我没把数组处理好
                //有点急躁。
            }
        }
        return index;
       
    }
    
    public static void main(String[] args){
		int[] nums ={1,1,2,2,2,2,3,4,4,5,5,6,7,8};
		No27 no =new No27();
		System.out.println(no.removeElement(nums,3));
	}
}


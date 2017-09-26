public class Solution{
    public int[] twoSum(int[] nums, int target){
        int[] index = new int[2];//new一个整型数组，大小为2，指向变量index
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    index[0]=i;
                    index[1]=j;
                    return index;
                 }
            }
        }
        return index;
    }
}



or

class Solution {
    public int[] twoSum（int[] nums, int target）{
    HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
    int[] index = new int[2];
   
    for(int i = 0; i<nums.length; i++){
        m.put(nums[i], i);//建立了一个key-value，key为nums[i]，而value为0,1,2,3,4....nums.length
    }
    for(int i =0; i<nums.length; i++){
        int temp =target - nums[i];
 
        if(m.containsKey(temp) && m.get(temp) != i){
            index[0] = i;
            index[1] = m.get(temp);
            break;
        }
     }
     return index;
   }
} 

or

class Solution {
    public int[] twoSum(int[] nums, int target){
    HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
    int[] index = new int[2];

    for(int i = 0; i<nums.length; i++){
        if(m.containsKey(target-nums[i])){
            index[0]=i;
            index[1]=m.get(target-nums[i]);
            break;
         }
         m.put(nums[i],i);
    }
    return index; 
   }
}



import java.util.ArrayList;
import java.util.List;
public class Solution {    
    public List<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<String>();
        for(int i = 1; i <= n; i++){    //题目是从1开始哦，不要思维定式，从0开始
           if(i % 3 == 0 && i % 5 == 0){   //这个条件可以换为i%15,但是一定要放在第一个if语句里
               results.add("fizz,Buzz");
           }else if(i % 5 == 0){   //要用else，否则下面的输出会有多余  
               results.add("Buzz");
           }else if(i % 3 == 0){
               results.add("fizz");
           }else results.add(String.valueOf(i));
        }
        return results;
    }  
    //测试用例
    public static void main(String[] args){
       Solution s = new Solution();
       System.out.println(s.fizzBuzz(15));
    }
}

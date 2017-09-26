public class Solution {
/*
 * @param a: An integer
 * @param b: An integer
 * @return: The sum of a and b
 */
    public int aplusb(int a, int b) {
        // write your code her
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        int c = a ^ b;    //这里有个要注意的点是 ，不能是int a = a^b,因为下面一行代码是要用到a的，所以要重新定义一个变量
        int d = (a & b) << 1;
        return aplusb( c, d);
    }
}


or
public class Solution {
    public int aplusb(int a, int b) {
        while(b != 0){
            int c = a ^ b;
            int d = (a & b) << 1;
            return aplusb(c,d);
        }
        return a;
    }
}

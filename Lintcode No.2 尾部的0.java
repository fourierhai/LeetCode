public class Solution {
    public long trailingZeros(long n) {
        long sum = 0;   //这里有个小坑，局部变量（如果下面要用到的话）一定要初始化（否则会报错）
        while (n != 0){
            sum += n / 5;
            n = n / 5;
        }
        return sum;
    }
}

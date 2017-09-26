public class Solution {
    public void rotateString(char[] str, int offset) {
        char temp;
        if (offset == 0 || str.length == 0) {
            return;
        }
        int len = str.length;
        for (int i = 1; i <= offset % len; i++) { //循环次数取决于偏移量
            temp = str[len - 1];
            int j = len - 2;
            while (j >= 0) {    //这个while循环是让[0-j]的元素全体往后移动一位。
                str[j + 1] = str[j];
                j--;
            }
            str[0] = temp;
        }
    }
    //测试用例
   public static void main (String[] args){
       Solution s = new Solution();
       char[] c = new char[]{'a','b','c','d','e','f','g'};
       //System.out.println(c);
       s.rotateString(c,15);
       System.out.println(c);
    }
}

public class Solution {
    public int[] mergeSortedArray(int[] A, int[] B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];
        while (i < m && j < n){
            if (A[i] <= B[j]){
                C[k++] = A[i++]; 
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < m){
            C[k++] = A[i++];
        }
        while (j < n){
            C[k++] = B[j++];
        }
        return C;
    }
}

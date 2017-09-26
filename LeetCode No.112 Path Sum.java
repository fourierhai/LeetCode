class Solution {
   public int minDepth(TreeNode root) {
       if(root == null){
            return false;
       }

       else if(root.left == null && root.right == null){
           return sum - root.val == 0;       
       }

       else if(root.left == null){
           return hasPathSum(root.right, sum - root.val);
       }

       else if(root.right == null){
           return hasPathSum(root.left, sum - root.val);
       }

       return hasPathSum(root.left, sum - root.val)||hasPathSum(root.right, sum - root.val);
   }
}
   

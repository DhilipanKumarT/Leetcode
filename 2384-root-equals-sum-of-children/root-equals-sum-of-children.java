class Solution 
{
    public boolean checkTree(TreeNode root)
    {
       int temp=root.val;
       int sum=0;
       if(root.left!=null&&root.right!=null)
       {
        sum+=root.left.val+root.right.val;
       }
       if(temp==sum)
       {
        return true;
       }
    return false; 
    }
}
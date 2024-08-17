class Solution 
{
    public boolean isUnivalTree(TreeNode root) 
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int q_size=q.size();
            for(int i=0;i<q_size;i++)
            {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                    if(temp.val!=temp.left.val)
                     return false;
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                     if(temp.val!=temp.right.val)
                     return false;
                }
            }
        }
        return true;
    }
}
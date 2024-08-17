class Solution 
{
    public int deepestLeavesSum(TreeNode root) 
    {
        int res=0;
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int q_size=q.size();
            res=0;
            for(int i=0;i<q_size;i++)
            {
                TreeNode temp=q.poll();
                res+=temp.val;
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
     return res;   
    }
}
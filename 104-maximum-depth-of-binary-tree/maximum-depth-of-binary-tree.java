class Solution
 {
    public int maxDepth(TreeNode root) 
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
            for(int i=0;i<q_size;i++)
            {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            res++;
        }
    return res;
        
    }
}
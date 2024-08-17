class Solution 
{
    public int sumOfLeftLeaves(TreeNode root) 
    {
      int res=0;
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
                    if(temp.left.left==null&&temp.left.right==null)
                    {
                     res+=temp.left.val;
                    }
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
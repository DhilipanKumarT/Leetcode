class Solution 
{
    public int maxLevelSum(TreeNode root) 
    {
         if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<Long> li=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            long sum=0;
            int q_size=q.size();
            for(int i=0;i<q_size;i++)
            {
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
          li.add(sum); 
        }
        long temp= Collections.max(li);
        return li.indexOf(temp)+1;
        
    }
}
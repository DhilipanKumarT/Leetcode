class Solution 
{
    public long kthLargestLevelSum(TreeNode root, int k) 
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
        Collections.sort(li);
        Collections.reverse(li);
        if(k<=li.size())
         return li.get(k-1);
        return -1;
    }
}
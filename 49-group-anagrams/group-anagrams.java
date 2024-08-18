class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> has=new HashMap<>();
        for( int i=0;i<strs.length;i++)
        {
            char []temp=strs[i].toCharArray();
            Arrays.sort(temp);
            String a=new String(temp);
            if(!has.containsKey(a))
            {
                has.put(a,new ArrayList<>());
            }
            has.get(a).add(strs[i]);
        }
    return  new ArrayList<>(has.values()); 
    }
}
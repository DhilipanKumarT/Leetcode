class Solution {
    public String reorganizeString(String s) 
    {
        int res[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            res[s.charAt(i)-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        char pre='@';
        int i=0;
        while(i<n)
        {
            int max=0,char_max=0;
            for(int j=0;j<26;j++)
            {                
                if(res[j]>max&&pre!=(j+'a')&&res[j]>0)
                {
                    max=res[j];
                    char_max=j;
                }
            }
            if(max==0) 
            {
                return "";
            }
            pre=(char)(char_max+'a');
            ans.append(pre);
            res[char_max]--; 
            i++;
        }        
        return ans.toString();
    }
}

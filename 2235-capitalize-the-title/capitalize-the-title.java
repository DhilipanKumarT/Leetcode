class Solution
{
    public String capitalizeTitle(String title) 
    {
        String res="";
        String []st=title.split(" ");
        for(int i=0;i<st.length;i++)
        {
            String tem=st[i];
            if(tem.length()> 2) 
            {
            tem=tem.toLowerCase();
            char c=tem.charAt(0);
            c=Character.toUpperCase(c);
            res+=c+(tem.substring(1))+" ";
            }
            else 
            {
                res+=(tem.toLowerCase())+(" ");
            }
        }
    return res.trim();    
    }
}
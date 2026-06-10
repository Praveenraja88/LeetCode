class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        int n = strs.length;
        int m = str.length();
        String res = "" ;

        if(n==1) return str ;

        for(int i=0;i<m;i++)
        {
            int f = 0 ;
            for(int j=1;j<n;j++)
            {
                if(i>=strs[j].length() || str.charAt(i) != strs[j].charAt(i) )
                {
                    return res;
                }
                else
                {
                   f=1;
                }
            }
            if(f==1)
            {
                res+=str.charAt(i);
            }
        }

        return res ;
    }
}
class Solution {
    public int numOfStrings(String[] p, String word) {

        int n = p.length;

        int m = word.length();

        int cnt = 0 ;
        int f = 0 ;

        for(int i=0;i<n;i++)
        {
            f = 0 ;
            String ch = p[i];
            int s = ch.length();
            
            for(int j=0;j<s;j++)
            {
                for(int k=0;k<m;k++)
                {
                    if(ch.charAt(j) == word.charAt(k) && k+s<=m )
                    {
                        String substr = word.substring(k,k+s);
                        if( ch.equals(substr))
                        {
                            cnt++;
                            f=1;
                            break;
                        }
                    }
                }
                if(f==1)
                {
                    break;
                }
            }
        }

        return cnt ; 
        
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hash = new int[256];
        int len = 0 , maxx = Integer.MIN_VALUE;
        if(n==0) return 0 ;
        for(int i=0;i<n;i++)
        {
            Arrays.fill(hash,0);
            len = 0 ;
            for(int j=i;j<n;j++)
            {
                if(hash[s.charAt(j)]==1)
                {
                    break;
                }
                hash[s.charAt(j)]++;
                len++;
                maxx = Math.max(maxx,len);
            }
        }
        return maxx ;
    }

}
class Solution {
    public int maxProduct(int n) {

        int mul = 1 ;
        int maxx = Integer.MIN_VALUE; 
        String str = Integer.toString(n);
        int m = str.length();

        for(int i=0;i<m-1;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int f = str.charAt(i) - '0';
                int s = str.charAt(j) - '0';
                mul = f * s ;
                maxx = Math.max(mul,maxx);
            }
            // int f = str.charAt(i) - '0' ;
            // int s = str.charAt(i+1) - '0' ;
            // mul = f * s ;
            // maxx = Math.max(mul,maxx);
        }

        return maxx ; 
        
    }
}
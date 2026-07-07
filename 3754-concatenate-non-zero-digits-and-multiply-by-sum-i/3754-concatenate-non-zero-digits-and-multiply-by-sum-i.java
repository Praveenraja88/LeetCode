class Solution {
    public long sumAndMultiply(int n) {

        String str = String.valueOf(n);

        int sum = 0 ;
        int val = 0 ;  

        for(char ch : str.toCharArray())
        {
            int num = ch - '0' ;
            if(num>0)
            {
                val = (val*10) + num ;
                sum += num ; 
            }
        }

        return (long) sum*val;
        
    }
}
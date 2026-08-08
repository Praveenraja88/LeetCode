class Solution {
    public int smallestNumber(int n, int t) {

        int res = 0 ;
        int num = n ; 

        while(true)
        {
            int mul = 1 ;
            int temp = num ;

            while(temp>0)
            {
                int rem = temp % 10 ;
                mul = mul * rem ;
                temp = temp / 10 ;
            }

            if(mul%t==0)
            {
                res = num ;
                break;
            }
            num++;
        }

        return res;
        
    }
}
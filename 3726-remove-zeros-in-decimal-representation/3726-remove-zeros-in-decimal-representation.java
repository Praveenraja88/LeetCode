class Solution {
    public long removeZeros(long n) {
        String str  = String.valueOf(n);
        String ans="";
        for(char i:str.toCharArray())
        {
            if(i!='0')
            {
                ans+=i;
            }
            else{
                continue;
            }
        }
        return Long.parseLong(ans);
    }
}
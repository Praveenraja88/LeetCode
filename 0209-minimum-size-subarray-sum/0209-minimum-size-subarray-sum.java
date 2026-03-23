class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // int n = nums.length;

        // int ans = Integer.MAX_VALUE;
        // int sum = 0 ;
        // int L=0;

        // for(int R=0;R<n;R++)
        // {
        //     sum+=nums[R];
        //     while(sum>=target)
        //     {
        //         ans = Math.min(ans , R-L+1);
        //         sum-=nums[L];
        //         L++;
        //     }
        // }

        // return ans;

        int n = nums.length;

        int i=0 , j=0 ;

        int min_len=Integer.MAX_VALUE,curr_sum=0;
         

        while(j<n)
        {
            curr_sum+=nums[j];
            while(curr_sum>=target)
            {
                min_len=Math.min(min_len,j-i+1);
                curr_sum-=nums[i];
                i++;
            }
            j++;
        }

        return min_len==Integer.MAX_VALUE?0:min_len;

    

        
    }
}
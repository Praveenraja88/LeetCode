class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int len = 0 ,maxlen = 0 , zero = 0 ;
        int left = 0 , right = 0 ;

        while(right < n)
        {
            if(nums[right]==0)
            {
                zero++;
            }

            if(zero>k)
            {
                if(nums[left]==0) zero--;
                left++;
            }

            if(zero<=k)
            {
                len = right - left + 1 ;
                maxlen = Math.max(maxlen,len);
            }
            right++;
        }

        return maxlen ; 
    }
}
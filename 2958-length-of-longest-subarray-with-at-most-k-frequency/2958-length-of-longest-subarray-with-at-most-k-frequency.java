class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        int left = 0 , right = 0 ;
        int len = 0 , maxlen = 0 ;

        while(right<n)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            right++;
            while(map.get(nums[right-1]) > k)
            {
                map.put(nums[left],map.get(nums[left]) - 1 );
                left++;
            }
            len = right - left  ;
            maxlen = Math.max(len,maxlen);
        }
        

        return maxlen;

        
    }
}
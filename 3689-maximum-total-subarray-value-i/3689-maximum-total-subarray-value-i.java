class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MAX_VALUE;

        for(int num : nums)
        {
            m1 = Math.max(m1,num);
            m2 = Math.min(m2,num);
        }

        return (long) (m1-m2)*k;
    }
}
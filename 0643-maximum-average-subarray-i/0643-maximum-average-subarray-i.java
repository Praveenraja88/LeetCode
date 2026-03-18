class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        if(n==1) return (double) nums[0];

        int fsum = 0 ;

        for(int i=0;i<k;i++)
        {
            fsum = fsum + nums[i] ;
        }

        int sum = fsum ;
        int j = 0; 
        int maxxsum = sum ;

        for(int i=k;i<n;i++)
        {
            sum = sum + nums[i] - nums[j] ;
            j++;
            maxxsum = Math.max(maxxsum,sum);
        }

        return (double) maxxsum/k;


        
    }
}
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {

        int n = nums.length;
        long ans = 0 ;

        Arrays.sort(nums); 

        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        for(int i=0;i<k;i++)
        {
            if(mul>1)
            {
                ans += Math.max((long) nums[i] , 1L * nums[i] * mul) ;
            }
            else
            {
                ans += nums[i];
            }  
            mul--;
        }

        return (long) ans ;

        

        
        
    }
}
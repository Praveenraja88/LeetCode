class Solution {
    public int findMaxLength(int[] nums) {

        int n = nums.length;

        int sum = 0 ;

        int maxx = 0 ;

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);

        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                sum+=-1;
            }

            else
            {
                sum+=1;
            }

            if(map.containsKey(sum))
            {
                maxx = Math.max(maxx,i-map.get(sum));
            }
            else
            {
                map.put(sum,i);
            }
        }
        
        return maxx ;
    }
}
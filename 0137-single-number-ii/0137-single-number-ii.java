class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<n;i++)
        {
            int val = nums[i];

            map.put(val,map.getOrDefault(val,0)+1);
        }

        int ans = 0 ;

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int freq = entry.getValue();

            if(freq==1)
            {
                ans= key ;  ;
            }
        }

        return ans ;

        
    }
}
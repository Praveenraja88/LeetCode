class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        Arrays.sort(costs);

        int cnt = 0 ;

        for(int i=0;i<n;i++)
        {
            if(coins >= costs[i])
            {
                coins -= costs[i];
                cnt++;
            }
            else
            {
                break;
            }
        }
        return cnt;
    }
}
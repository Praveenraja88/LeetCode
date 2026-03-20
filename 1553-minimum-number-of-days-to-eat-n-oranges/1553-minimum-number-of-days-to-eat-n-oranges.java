class Solution {

    Map<Integer,Integer> memo = new HashMap<>();

    int fun( int n ){
        if(n==0) return 0 ;

        if(n<0) return Integer.MAX_VALUE ; 

        if(memo.containsKey(n)) return memo.get(n); 
        
        int ans = Integer.MAX_VALUE;

        ans = Math.min(ans , (n%2) + 1 + fun(n/2));

        ans = Math.min(ans , (n%3) + 1 + fun(n/3));

        memo.put(n,ans);

        return ans; 

    }
    public int minDays(int n) {

        int res = fun( n );

        return res - 1 ;
        
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;

        int[] arr = new int[n+1];
        arr[0]=0;
        int maxx = 0 ;

        for(int i=0;i<n;i++)
        {
            arr[i+1] = arr[i] + gain[i] ;

            maxx = Math.max(maxx,arr[i+1]);

        }

        return maxx ;
    }
}
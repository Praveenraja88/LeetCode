class Solution {
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {

        int ans = Integer.MAX_VALUE;

        int n = ld.length;
        int m = wd.length;

        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<m;j++)
            {
                // land -> water
                int landfinish = ls[i] + ld[i];
                int waterstart = Math.max(landfinish , ws[j]);
                int f1 = waterstart + wd[j];

                ans = Math.min(ans,f1);

                int waterfinish = ws[j] + wd[j] ;
                int landstart = Math.max(waterfinish , ls[i]);
                int f2 = landstart + ld[i];

                ans = Math.min(ans,f2);
            }
        }


       
        return ans ;



        
        
    }
}
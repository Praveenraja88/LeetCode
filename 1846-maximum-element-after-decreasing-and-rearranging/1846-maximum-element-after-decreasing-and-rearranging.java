class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        int n = arr.length;
        int f=0;
        Arrays.sort(arr);

        if(arr[0]!=1)
        {
            arr[0]=1;
        }

        // Check difference between 
        for(int i = 1 ; i < n ; i++ )
        {
            boolean chk = (arr[i] - arr[i-1]) <= 1 ;
            if( chk == false ) 
            {
                arr[i] = arr[i-1] + 1 ; 
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.add(num);
        }

        return pq.poll();




        
        
    }
}


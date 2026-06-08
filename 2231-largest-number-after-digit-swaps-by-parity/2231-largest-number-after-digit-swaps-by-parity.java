import java.util.*;

class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        String nums = String.valueOf(num);
        int n = nums.length();

        for(int i=0;i<n;i++)
        {
            int digit = nums.charAt(i) - '0' ;
            if(digit%2==0)
            {
                p.add(digit);
            }
            else
            {
                q.add(digit);
            }
        }

        int ans = 0 ;

        for(int i=0;i<n;i++)
        {
            ans = ans * 10 ;
            if((nums.charAt(i)-'0')%2==0)
            {
                ans+=p.peek();
                p.poll();
            }
            else
            {
                ans+=q.peek();
                q.poll();
            }
        }

        return ans;
    }
}



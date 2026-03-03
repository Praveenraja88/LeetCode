class Solution {
    public int finalValueAfterOperations(String[] op) {
        int X = 0 ;

        for(String s:op)
        {
            if(s.equals("X++") || s.equals("++X") )
             {
                X++;
            }

            else if(s.equals("X--") || s.equals("--X") )
            {
                X--;
            }
        }

        return X;
    }
}
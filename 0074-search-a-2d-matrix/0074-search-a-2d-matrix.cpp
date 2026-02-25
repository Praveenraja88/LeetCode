class Solution {
public:
    bool searchMatrix(vector<vector<int>>& mt, int t) {
        int m=mt.size();
        int n=mt[0].size();

        int row=m-1;
        int col=0;

        while(row>=0 && col<n)
        {
            if(mt[row][col]==t)
            {
                return true;
            }

            else if(mt[row][col]<t)
            {
                col++;
            }
            else{
                row--;
            }
            
        }
        return false;
        
    }
};
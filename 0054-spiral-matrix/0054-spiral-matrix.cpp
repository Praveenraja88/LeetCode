class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& m) {
       vector<int> res;
       int rs=0,cs=0;
       int re=m.size()-1; 
       int ce=m[0].size()-1;

        while(rs<=re && cs<=ce)
        {

            for(int i=cs;i<=ce;i++)
            {
                res.push_back(m[rs][i]);
            }
            rs++;

            for(int i=rs;i<=re;i++)
            {
                res.push_back(m[i][ce]);
            }
            ce--;

            if(rs<=re)
            {
                for(int i=ce;i>=cs;i--)
                {
                    res.push_back(m[re][i]);
                }
                re--;
            }

            if(cs<=ce)
            {
                for(int i=re;i>=rs;i--)
                {
                    res.push_back(m[i][cs]);
                }
                cs++;
            }
        }

        return res;


    }
};
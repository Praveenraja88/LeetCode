class Solution {
public:
    vector<vector<int>> subset;
    void rec(int idx ,vector<int> sub ,vector<int>& nums){
        if(idx == nums.size()){
            subset.push_back(sub);
            return ;
        }

        sub.push_back(nums[idx]);
        rec(idx+1,sub,nums); //Take
        sub.pop_back();

        rec(idx+1,sub,nums); //Dont take

    }

    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        for(int mask = 0;mask < (1 << n);mask+=1){
            vector<int> sub;
            for(int i=0;i<n;i++){
                if((mask >> i) & 1)
                    sub.push_back(nums[i]);
            }
            subset.push_back(sub);
        }

        return subset;
    }
};
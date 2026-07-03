class Solution {

    public static void backtrack(List<List<Integer>> resultlist , List<Integer> temp , int[] nums )
    {

        if(temp.size() == nums.length)
        {
            resultlist.add(new ArrayList<>(temp));
            return ; 
        }

        for(int num : nums)
        {
            if(temp.contains(num))
            {
                continue ;
            }

            temp.add(num);

            backtrack(resultlist,temp,nums);

            temp.remove(temp.size()-1);
        }




    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> resultlist = new ArrayList<>();

        backtrack(resultlist,new ArrayList<>() , nums);

        return resultlist ;
        
    }
}
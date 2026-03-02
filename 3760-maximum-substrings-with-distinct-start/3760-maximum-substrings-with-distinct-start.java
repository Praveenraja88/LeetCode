class Solution {
    public int maxDistinct(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        int cnt=0;
        for(char ch:s.toCharArray())
        {
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
                cnt++;
            }
        }
        return cnt;
    }
}
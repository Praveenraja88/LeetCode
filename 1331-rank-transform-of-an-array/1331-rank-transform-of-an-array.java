class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        int[] dup = arr.clone();

        Arrays.sort(dup);

        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 1 ;

        for(int it : dup)
        {
            if(!map.containsKey(it))
            {
                map.put(it,cnt++);
            }
        }
        int j = 0 ;

        for(int it : arr)
        {
            dup[j++] = map.get(it);
        }

        return dup;
        
    }
}   
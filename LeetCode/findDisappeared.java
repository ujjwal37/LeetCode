class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n  = nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer , Integer>();
        for(int i = 1 ; i <= n ; i++)
            map.put(i , 0);
        
        for(int i  : nums){
            if(map.containsKey(i))
            map.put(i , map.get(i)+1);
        }
    Set<Map.Entry<Integer,Integer>> s = map.entrySet();
        for(Map.Entry<Integer, Integer> it : s){
            if(it.getValue() == 0)
                arr.add(it.getKey());
                
        }
        
        
        
    return arr;
    }
    }

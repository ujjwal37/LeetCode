class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> counter = new HashMap<Integer,Integer>();
        
        for(int i : nums){
            if(counter.containsKey(i)){
                counter.put(i,counter.get(i)+1);
            }else{
                counter.put(i,1);
            }
        }
      for(int i : nums){
          if(counter.get(i) == 1)
          return i;
      }
        return 0;
    }
}
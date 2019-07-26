class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> duplicate = new HashMap<Integer,Integer>();
        
        for(int i : nums){
            if(duplicate.containsKey(i)){
                return true;
            }else{
                
                duplicate.put(i , 1);
            }
        }
        
        return false;
    }
}
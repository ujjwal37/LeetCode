class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        int count = 0;
        Map<String,Integer> set = new HashMap<>();
        
        for(int arr[] : dominoes){
            
            String str1 = arr[1]+""+arr[0];
            String str2 = arr[0]+""+arr[1];
            
            if(set.containsKey(str1)){
                count += set.get(str1);
                set.put(str1,set.get(str1)+1);
                continue;
            }
            if(set.containsKey(str2)){
                count+=set.get(str2);
                set.put(str2,set.get(str2)+1);
                continue;
            }
            set.put(str1,1);
        }
            
         return count;   
        }
}
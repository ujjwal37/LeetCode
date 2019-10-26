class Solution {
    public int compress(char[] chars) {
        int cons = 0;
        int index = 0; 
        
        for(int i =0 ; i < chars.length; i++){
            cons++;
            if( i + 1 == chars.length || chars[i] != chars[i+1]){
                chars[index++] = chars[i];
                
                if(cons != 1){
                    String str = Integer.toString(cons);
                    
                    for(int j = 0  ;  j < str.length(); j++)
                        chars[index++] = str.charAt(j);
                }
                cons = 0;
            }
        }
        return index;
    }
}
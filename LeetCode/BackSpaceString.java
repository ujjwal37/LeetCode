class Solution {
    public boolean backspaceCompare(String S, String T) {
    
        return helper(S).equals(helper(T)) ? true : false;
}
    private String helper(String s){
        StringBuilder sb = new StringBuilder();
        int numback =0;
        for(int i = s.length()-1; i >= 0 ; i--){
            char tc = s.charAt(i);
            if(tc == '#'){
                numback++;
            }else{
                if(numback > 0){
                    numback--;
                }else{
                    sb.append(s.charAt(i));
                }
            }
            
        }
        return sb.toString();
    }
}
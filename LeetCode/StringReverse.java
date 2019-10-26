class Solution {
    public String reverseWords(String s) {
      String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String ans : words){
            sb.append(new StringBuffer(ans).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }
}
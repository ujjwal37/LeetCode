class Solution {
    public int calculateTime(String keyboard, String word) {
        
        int i = 0 ;
        int j = 0;
        int sum = 0;
        for(int  k  = 0 ; k < word.length(); k++){
             j = keyboard.indexOf(word.charAt(k));
             sum += Math.abs(i - j);
            i = j;
        }
        return sum;
    }
}
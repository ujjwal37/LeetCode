class Solution {
    public int[] diStringMatch(String S) {
        int  i = 0;
        int d = S.length();
        int[] arr = new int[d+1];
        for(int j =0 ; j < S.length();j++){
            if(S.charAt(j) == 'I'){
                arr[j] = i;
                i++;
            }else{
                arr[j] = d;
                d--;
            }
        }
        arr[S.length()] = d;
        return arr;
    }
}
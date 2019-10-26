class Solution {
    
    
    public int lenLongestFibSubseq(int[] A) {
        int max = 0;
        int prev = 0;
        HashSet<Integer> map = new HashSet<Integer>();
            
            for(int i : A) map.add(i);
        
        for(int i = 0 ; i < A.length; i++){
        for(int j = i+1;  j < A.length ; j++){
            int x = A[j];
            int y = A[i]+A[j];
            int lenth = 2;
            while(map.contains(y)){
                int temp = y;
                y += x;
                x  = temp;
                max = Math.max(max , ++lenth);
            }
        }
        }
            return max;
    }
}
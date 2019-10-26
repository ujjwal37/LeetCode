class Solution {
 
        
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
     if (A==null || A.length < L+M) return 0;   
     int []sum = new int[A.length];
     sum[0]=A[0];    
     for(int i=1; i< A.length;i++){
        sum[i] = sum[i-1] + A[i];  
     }   
     int maxL = sum[L-1]; // initial value
     int maxM = sum[M-1]; // initial value
     int res = sum[L+M-1];  // initial value
     for(int i=L+M; i < sum.length; i++){
        maxL = Math.max(maxL, sum[i-M]-sum[i-M-L]); // maxL at i-M position
        maxM = Math.max(maxM, sum[i-L]-sum[i-M-L]); //maxM at i-L position  
        res = Math.max(res, Math.max(maxL + sum[i] - sum[i-M],
                                     maxM + sum[i] - sum[i-L]));
     }   
     return res;   
    }}


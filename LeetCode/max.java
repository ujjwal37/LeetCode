class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
         int res = 0;
         int min1 = arr1[0] + arr2[0];
         int min2 = -arr1[0] + arr2[0];
         int min3 = arr1[0] - arr2[0];
         int min4 = -arr1[0] - arr2[0];
         
         for(int i=1;i<arr1.length;i++){
            int cur1 = arr1[i] + arr2[i] + i;
            int cur2 = -arr1[i] + arr2[i] + i;
            int cur3 = arr1[i]-arr2[i] + i;
            int cur4 = -arr1[i] - arr2[i] + i;
            res = Math.max(res, cur1 - min1);
            res = Math.max(res, cur2 - min2);
            res = Math.max(res, cur3 - min3);
            res = Math.max(res, cur4 - min4);
            min1 = Math.min(cur1, min1);
            min2 = Math.min(cur2, min2);
            min3 = Math.min(cur3, min3);
            min4 = Math.min(cur4, min4);
         }
        
        return res;
    }
}
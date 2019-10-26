class Solution {
          public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap();
        int max = 1;
        for (int a : arr) {
            if (map.containsKey(a - difference)) {
                int len = map.get(a - difference) + 1;
                max = Math.max(max, len);
                map.put(a, len);
            } else {
                map.put(a, 1);
            }
        }
        return max;
    
    }
}
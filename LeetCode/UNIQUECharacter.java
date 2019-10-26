class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> memo = new HashMap<>();
        int max = 0;
        for (String w : words) {
            int best = 1;
            for (int i = 0; i < w.length(); ++i) {
                String tmp = w.substring(0, i) + w.substring(i + 1);
                best = Math.max(best, memo.getOrDefault(tmp, 0) + 1);
            }
            memo.put(w, best);
            max = Math.max(max, best);
        }
        return max;
    }
}
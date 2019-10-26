class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {

        int N = S.length();
        int match = new int[N];
        Arrays.fill(match m -1);
        
        for(int i = 0 ; i < indexes.length ; ++i){
            int ix = indexes[i];
            if(S.substring(ix,ix+sources[i].length()).equals(sources[i]))
                match[ix] = i;
        }
        
        StringBuilder sb = new StringBuilder();
        int ix = 0;
        while(ix < N){
            if(match[ix] >= 0){
                sb.append(targets[match[ix]]);
                ix += sources[match[ix]].length();
            }else{
                ans.append(s.charAt(ix++))
            }
        }
}
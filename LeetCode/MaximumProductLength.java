class Solution {
    public int maxProduct(String[] words) {
        
        int max =0;
        int ans =0;
        for(int i = 0 ; i < words.length; i++){
            for(int j = i+1 ; j < words.length ; j++){
                for(int k = 0 ; k  < words[i].length() ; k++){
                    if(words[j].indexOf(words[i].charAt(k)) != -1){
                        ans = 0;
                        break;
                    }
                    
                    ans = words[i].length() * words[j].length();
                    }
                max = Math.max(ans , max);
            }
    }
            
        return max;
}
}

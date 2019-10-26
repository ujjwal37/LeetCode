class Solution {
    
    
    public boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }     
    
    public String decode(String s, int start, int end) {
        
        
        StringBuilder ret = new StringBuilder();
        int i = start;
        
        
        while(i <=end) {
            
            if(!isNum(s.charAt(i))) {
                ret.append(s.charAt(i));
                i++;
                continue;
            } else {
                
                //num found 
                
                int numStart = i;
                while(isNum(s.charAt(numStart))) {
                    numStart++;
                }
                
                String num = s.substring(i,numStart);
                
                int rep = Integer.parseInt(num);
                
                int start_sub = numStart+1;
                int count = 1;
                while(count > 0) {
                    if(s.charAt(start_sub) == '[') count++;
                    if(s.charAt(start_sub) == ']') count--;
                    start_sub++;
                }
                
           //     System.out.println("decode " + s.substring(numStart,start_sub));
                
                String subS = decode(s,numStart+1,start_sub-2);
                
                for(int x =0; x < rep; x++) {
                    ret.append(subS);
                }
                
                i = start_sub;   
            }
            
            
        }
        
        return ret.toString();
        
    }
    
    
    public String decodeString(String s) {
        
        StringBuilder ret = new StringBuilder();
        return decode(s,0, s.length()-1);
    }
}
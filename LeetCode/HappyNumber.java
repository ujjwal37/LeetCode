class Solution {
    public boolean isHappy(int n) {
        if (n==1) {
            return true;
        } 
		else if (n<1) { 
            return false;
        }
        int count = 0;
        int result = 0;
        while (count < 10) {
            
            while (n>0) {
                result += (n%10) * (n%10);
                n=n/10;
            }
            if (result == 1) {
                return true;
            } else {
                n=result;
                result = 0;
            }
            count++;
        }
        return false;
        
    }
}
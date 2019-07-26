class Solution {
    public int countPrimes(int n) {
        int count = 0;   
        boolean prime = true;
        for(int num=2;num<n;num++) {
            for(int i=2;i<=Math.sqrt(num);i++) {
                if(num%i == 0 && num!=i) {
                    prime = false;
                    break;
                } 
            }
            if(prime) {
                count++;
            } else {
                // Continue for next iteration, undo the existing value
                prime = true;
            }
        }
        return count;
        
    }
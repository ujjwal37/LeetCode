




class Solution {
    public int addDigits(int num) {
          
            int temp =0, sum = 0;
         while( num != 0)
         {
             temp  = num %10;
                 num  = num /10;
                 sum += temp;
                 
         }
            if(sum / 10 == 0)
                    return sum;
            
            return addDigits(sum);
    }
}

public class AddDigits{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int ret = new Solution().addDigits(num);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        if( prices.length == 0)
            return 0;
        
        int sum =0;
        int min = prices[0];
        int max =0;
        for(int i = 1 ; i <  prices.length; i++)
        {
            if( prices[i] > min){
                sum += ( prices[i] -min);
                min = prices[i];
        }else{
            min = prices[i];
        }
            
        }
        return sum;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] prices = stringToIntegerArray(line);
            
            int ret = new Solution().maxProfit(prices);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
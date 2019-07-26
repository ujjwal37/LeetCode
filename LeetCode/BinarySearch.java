class Solution {
    
    public int BinarySearch(int[] num  , int low, int high, int target){
        
        int mid = low + (high - low)/2;
        while(low <= high){
            
         if(num[mid] == target)
             return mid;
            
         if(num[mid] > target)
             return BinarySearch(num,low,mid-1,target);
             
          if(num[mid] < target)
              return BinarySearch(num,mid+1,high,target);
            
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        int low = 0 ; 
        int high = nums.length -1;

        int n = BinarySearch(nums, low , high , target);
        return n;
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
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int ret = new Solution().search(nums, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
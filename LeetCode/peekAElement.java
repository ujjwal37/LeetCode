class Solution {
    
    public int peekEle(int[] nums,int low,int high,int n)
    {
        int mid = low+(high-low)/2;
        
        if((mid == 0 || nums[mid] >= nums[mid-1]) && (mid == n-1 || nums[mid]>= nums[mid+1]))
           return mid;
           
       else if(mid > 0 && nums[mid] < nums[mid-1])
           return peekEle(nums,low,mid-1,n);
           
        else
           return peekEle(nums,mid+1,high,n);
          
    }
    public int findPeakElement(int[] nums) {
        int n  = nums.length;
        int high = nums.length-1;
        int low = 0;
        return peekEle(nums,low,high,n);
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
            
            int ret = new Solution().findPeakElement(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
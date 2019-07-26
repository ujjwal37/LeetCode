class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> List = new ArrayList();
        if(rowIndex < 0)
            return List;
     for(int i =0  ; i < rowIndex +1 ; i++)
     {
         List.add(0, 1);
         
        for(int j = 1; j < List.size()-1;j++)
        {
            List.set(j , List.get(j+1) + List.get(j));
        }
     }
        return List;
}
}

public class MainClass {
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int rowIndex = Integer.parseInt(line);
            
            List<Integer> ret = new Solution().getRow(rowIndex);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}
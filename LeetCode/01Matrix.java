class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        
        
        int count = 0, k = 0 , l = 0 ;
        int min =  10;
        int n = matrix.length ;
        int m = matrix[0].length ;
        
      for(int i = 0; i < n ; i++){
          for(int j = 0 ; j < m ; j++)
          {
              if(matrix[i][j] == 0)
                  continue;
              
               k = i;
               l = j;
              
              if(matrix[i][j] == 1)
              {
        
                    while(matrix[k][l] == 1 && k > 0){
                        k--;
                        count++;
                    }
                  if(matrix[k][l] == 0)
                  min = Math.min(min , count);
                  count = 0;
                  k= i;
                  
                  
                  
                  while( k < n && matrix[k][l] == 1 )
                  {
                      k++;
                      count++;
    
                  }
                  if( k >= n)
                      k--;
                  
                   if(matrix[k][l] == 0)
                  min = Math.min(min,count);
                  k = i;
                  count =0;
                  
                  while(matrix[k][l] == 1 && l > 0){
                      l--;
                      count++;
                  }
                   if(matrix[k][l] == 0)
                  min = Math.min(min, count);
                  count = 0;
                  l = j;
                  
                  while( l < m   &&  matrix[k][l] == 1 )
                  {
                      l++;
                      count++;
                  }
                  if( l  >= m)
                      l--;
                  if(matrix[k][l] == 0)
                  min = Math.min(min,count);
                  count =0;
                   l = j;
                  
                  matrix[i][j] = min;
                  
                   min = 20;
                 }
              }
          }    
        return matrix;
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
    
    public static int[][] stringToInt2dArray(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
          return new int[0][0];
        }
    
        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
          JsonArray cols = jsonArray.get(i).asArray();
          arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }
    
    public static String int2dArrayToString(int[][] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "[]";
        }
    
        StringBuilder sb = new StringBuilder("[");
        for (int[] item : array) {
            sb.append(Integer.toString(item));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[][] matrix = stringToInt2dArray(line);
            
            int[][] ret = new Solution().updateMatrix(matrix);
            
            String out = int2dArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
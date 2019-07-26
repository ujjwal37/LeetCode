class Solution {
    public String addStrings(String num1, String num2) {
        int len = Math.max(num1.length(), num2.length());
    char[] val = new char[len];

    boolean carry = false;
    for(int i = 0; i < len; i++) {
        int temp = carry? 1: 0;
        if(num1.length() > i) {
            temp +=  num1.charAt(num1.length() - 1 - i ) - '0';
        }

        if(num2.length() > i) {
            temp +=  num2.charAt(num2.length() - 1 - i ) - '0' ;
        }

        if(temp >= 10) {
            carry = true;
            temp = temp%10;
        } else {
            carry = false;
        }

        val[len - 1 - i] = (char)(temp+ '0');
    }


    return carry ? ("1" + new String(val)) : new String(val);
    }
}

public class AddStrings {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String num1 = stringToString(line);
            line = in.readLine();
            String num2 = stringToString(line);
            
            String ret = new Solution().addStrings(num1, num2);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
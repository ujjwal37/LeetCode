public class Solution{
   public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        sb.append(S);

        while(true){

            boolean found = false;

            for(int i=1;i<sb.length();i++){
                if(sb.charAt(i)==sb.charAt(i-1)){
                    sb.delete(i-1,i+1);
                    found = true;
                    break;
                }
            }

            if(!found)
                break;
        }

        return sb.toString();
    }
}
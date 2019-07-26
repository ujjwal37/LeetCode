class Solution {

public boolean isIsomorphic(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }

    HashMap<Character, Character> map = new HashMap();
    HashMap<Character, Character> temp = new HashMap();
    for(int i=0; i < s.length(); i++){
        char a = s.charAt(i);
        char b = t.charAt(i);
        if(map.get(a) != null){
            if(b != map.get(a)){
                return false;
            }
        }else {
            if(temp.get(b)!=null){
                return false;
            }
            map.put(a, b);
            temp.put(b, b);
        }
    }
    return true;
}
}
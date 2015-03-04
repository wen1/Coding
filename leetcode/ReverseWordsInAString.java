public class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length(); i >= 0; i--){
            int j = i;
            while(i > 0 && s.charAt(i-1) == ' ')i--;
            j = i;
            while(i > 0 && s.charAt(i-1) != ' ')i--;
            if (i!=j){
                reversed.append(s.substring(i,j));
                reversed.append(" ");
            }
        }
        if (reversed.length()>0){
            return reversed.deleteCharAt(reversed.length()-1).toString();
        } else{
            return "";
        }
    }
}
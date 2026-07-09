// Last updated: 7/9/2026, 9:20:21 AM
class Solution {
    public String greatestLetter(String s) {
        for(int i=0;i<26;i++){
            char c1=(char) ('z'-i);
            char c2=(char) ('Z'-i);
            if(s.contains(String.valueOf(c1))&&s.contains(String.valueOf(c2))){
                return String.valueOf(c2);
            }
        }
        return "";
    }
}
class Solution {
    public String solution(String my_string, String letter) {
        
        StringBuilder sb = new StringBuilder();
        
        String[] str = my_string.split("");
        
        for(int i=0;i<str.length;i++) {
             if(!str[i].equals(letter)) {
                 sb.append(str[i]);
             }
        }
        
        return sb.toString();
    }
}
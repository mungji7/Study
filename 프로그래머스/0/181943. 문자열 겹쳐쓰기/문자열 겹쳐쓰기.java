class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String last = my_string.substring(s + overwrite_string.length());
    
        answer = my_string.substring(0, s) + overwrite_string + last;
        
        return answer;
    }
}
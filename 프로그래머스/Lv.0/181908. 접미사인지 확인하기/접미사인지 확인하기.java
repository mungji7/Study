class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        int index = my_string.length() - is_suffix.length();
        
        if (index < 0) {
            return answer;   
        }
        
        String suffix = my_string.substring(index);
        
        if (suffix.equals(is_suffix)) {
            answer = 1;
        } 
        
        return answer;
    }
}
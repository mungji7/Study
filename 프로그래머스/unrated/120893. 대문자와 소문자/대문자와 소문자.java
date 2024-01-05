class Solution {
    public String solution(String my_string) {
        String answer = ""; // 65 97
        
        char[] strArr = my_string.toCharArray();
        
        for (char str : strArr) {
            if (str >= 'a' && str <= 'z') {
                str -= 32;
            } else if (str >= 'A' && str <= 'Z') {
                str += 32;
            }
            
            answer += str;
        }
        
        return answer;
    }
}
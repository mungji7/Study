class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] strArr = my_string.split("");
            
        for (int i = c - 1; i < strArr.length; i += m) {
            answer += strArr[i];
        }
        
        return answer;
    }
}
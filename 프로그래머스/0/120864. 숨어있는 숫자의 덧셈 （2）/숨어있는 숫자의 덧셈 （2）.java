class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int temp = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (Character.isDigit(ch)) { // 숫자일때
                temp = temp * 10 + (ch - '0'); // ch - 0으로 문자를 숫자로 변환
            } else {
                answer += temp;
                temp = 0;
            }
        }
        
        answer += temp;
        
        return answer;
    }
}
class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] chArr = myString.toCharArray();
        
        for (char ch : chArr) {
            if (ch <= 'l') {
                ch = 'l';
            }
            answer += String.valueOf(ch);
        }
        
        return answer;
    }
}
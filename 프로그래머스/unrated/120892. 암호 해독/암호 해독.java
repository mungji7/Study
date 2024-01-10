class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] chArr = cipher.toCharArray();
        
        for (int i = 0; i < chArr.length; i++) {
            if ((i+1) % code == 0) {
               answer += chArr[i]; 
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(int age) {
        String answer = "";
        
        char[] chArr = String.valueOf(age).toCharArray();
        
        for (char ch : chArr) {
            ch = (char)(ch + 49);
            answer += String.valueOf(ch);
        }
        
        return answer;
    }
}
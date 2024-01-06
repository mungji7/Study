class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char[] chArr = rsp.toCharArray();
        
        for (char ch : chArr) {
            answer += (ch == '2' ? '0' : (ch == '0' ? '5' : (ch == '5' ? '2' : ch))); 
        }
        
        return answer;
    }
}
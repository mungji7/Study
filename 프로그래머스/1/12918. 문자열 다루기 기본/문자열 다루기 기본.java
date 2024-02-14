class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if ((s.length() == 4 || s.length() == 6) && isDigit(s)) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
    
    public boolean isDigit(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
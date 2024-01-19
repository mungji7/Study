class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        s = s.toUpperCase();
        
        for (char ch : s.toCharArray()) {
            if (ch == 'P') {
                count++;
            } else if (ch == 'Y') {
                count--;
            }
        }
        
        answer = count != 0 ? false : true;

        return answer;
    }
}
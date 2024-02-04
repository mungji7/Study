class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (pat.equals(myString.substring(i, pat.length() + i))) {
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        char[] ch = num_str.toCharArray();
        
        for (char num : ch) {
            answer += Character.getNumericValue(num);
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] chArr = my_string.toCharArray();
        char[] numArr = {'1','2','3','4','5','6','7','8','9','0'};
        
        for(char ch : chArr) {
            for(char num : numArr) {
                if(num == ch) {
                    answer += Character.getNumericValue(num);
                }
            }
        }
        
        return answer;
    }
}
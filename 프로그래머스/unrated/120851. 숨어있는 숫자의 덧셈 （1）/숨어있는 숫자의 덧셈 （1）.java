class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] chArr = my_string.toCharArray();
        
        for(char ch : chArr) {
           if(ch>='0' && ch<='9') {
               answer += Character.getNumericValue(ch);
           }
        }
        
        return answer;
    }
}
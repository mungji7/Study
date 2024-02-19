class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] arr = letter.split(" ");
        
        for (String s : arr) {
            for (int j = 0; j < morse.length; j++) {
                if (s.equals(morse[j])) {
                    answer += (char) (97 + j);   
                }
            }
        }
        
        return answer;
    }
}
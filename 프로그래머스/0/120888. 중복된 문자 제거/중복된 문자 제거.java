class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        
        for (int i = 0; i < strArr.length; i++) {
            if (!answer.contains(strArr[i])) {
                answer += strArr[i];
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String temp = "";
        
        String[] strArr = my_string.split("");
        
        for (int i = 0; i < strArr.length; i++) {
            if (i >= s && i <= e) {
                temp = strArr[i];
                strArr[i] = strArr[e];
                strArr[e] = temp;
                e--;
            }
            
            answer += strArr[i];
        }
        
        return answer;
    }
}
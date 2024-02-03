class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] strArr = binomial.split(" ");
        
        answer = Integer.parseInt(strArr[0]);
        
        for (int i = 1; i < strArr.length - 1; i++) {
            if (strArr[i].equals("+")) {
                answer += Integer.parseInt(strArr[i + 1]);
            } else if (strArr[i].equals("-")) {
                answer -= Integer.parseInt(strArr[i + 1]);
            } else if (strArr[i].equals("*")) {
                answer *= Integer.parseInt(strArr[i + 1]);
            }
        }
        
        return answer;
    }
}
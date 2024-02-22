class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] strArr = quiz[i].split(" ");
            int num = 0;
            
            if (strArr[1].equals("+")) {
                num = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
            } else if (strArr[1].equals("-")) {
                num = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
            }
            
            if (strArr[4].equals(String.valueOf(num))) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}
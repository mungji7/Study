class Solution {
    public int[] solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        
        int[] answer = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[strArr.length - i - 1]);
        }
        
        return answer;
    }
}
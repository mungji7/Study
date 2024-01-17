class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String[] strArr = String.valueOf(num).split("");    
        
        for (int i = 0; i < strArr.length; i++) {
            if (Integer.parseInt(strArr[i]) == k) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}
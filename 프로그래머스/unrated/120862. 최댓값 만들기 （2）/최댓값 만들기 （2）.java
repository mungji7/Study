class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE; // 최소값으로 초기화
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                
                answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }
        
        return answer;
    }
}
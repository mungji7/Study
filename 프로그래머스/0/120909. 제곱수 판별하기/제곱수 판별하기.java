class Solution {
    public int solution(int n) {
        int answer = 2;
        
        int sq = (int)Math.sqrt(n);
        
        if (sq * sq == n) {
            answer = 1;
        }
        
        return answer;
    }
}
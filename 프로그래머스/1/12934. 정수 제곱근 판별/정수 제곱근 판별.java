class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long sq = (long)Math.sqrt(n);
        
        if (sq * sq == n) {
            answer = (long)Math.pow(sq + 1, 2);
        }
        
        return answer;
    }
}
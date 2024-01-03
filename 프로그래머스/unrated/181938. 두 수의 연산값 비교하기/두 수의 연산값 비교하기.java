class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int mergeAB = Integer.parseInt("" + a + b);
        
        return mergeAB >= (2 * a * b) ? mergeAB : (2 * a * b); 
    }
}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int tmp = 0;
        
        for(int i=0;i<sides.length-1;i++) {
            if(sides[i]>sides[i+1]) {
                tmp = sides[i];
                sides[i] = sides[i+1];
                sides[i+1] = tmp;
            }
        }
        
        answer = sides[2]<sides[0]+sides[1]?1:2;
        
        return answer;
    }
}
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lenArr = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            lenArr[strArr[i].length()] += 1;
        }
        
        answer = lenArr[0];
        
        for(int i = 0 ; i < lenArr.length; i++){
            if (answer < lenArr[i]) {
                answer = lenArr[i];
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int order) {
        int answer = 0;
        int count = 0;
        
        String str = String.valueOf(order);
        String[] strArr = str.split("");
        String num[] = {"3", "6", "9"};
        
        for(int i=0;i<strArr.length;i++) {
            for(int j=0;j<num.length;j++) {
                if(strArr[i].contains(num[j])) {
                    answer++;
                }
            } 
        }
        
        return answer;
    }
}                                 
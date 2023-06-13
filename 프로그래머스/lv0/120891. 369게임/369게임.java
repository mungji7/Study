class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = String.valueOf(order);
        
        for(int i=0;i<str.length();i++) {
            char num = str.charAt(i);
            System.out.print(num);
            
            if(num == '3' || num == '6' || num == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}                                 
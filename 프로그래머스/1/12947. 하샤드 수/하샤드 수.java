class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int num = 0;
        String[] strArr = String.valueOf(x).split("");
        
        for (String s : strArr) {
            num += Integer.parseInt(s);
        }
        
        if (x % num != 0) {
            answer = false;
        }
        
        return answer;
    }
}
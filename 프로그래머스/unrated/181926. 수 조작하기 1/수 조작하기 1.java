class Solution {
    public int solution(int n, String control) {
        
        String[] strarr = control.split("");
        
        for(String str : strarr) {
            if(str.equals("w")) {
                n = n+1;
            } else if(str.equals("s")) {
                n = n-1;
            } else if(str.equals("d")) {
                n = n+10;
            } else if(str.equals("a")) {
                n = n-10;
            }
        }
        
        return n;
    }
}
class Solution {
    public int solution(int a, int b) {
        
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        if (Integer.valueOf(strA + strB) >= Integer.valueOf(strB + strA)) {
            return Integer.valueOf(strA + strB);
        } else {
            return Integer.valueOf(strB + strA);
        }  
    }
}
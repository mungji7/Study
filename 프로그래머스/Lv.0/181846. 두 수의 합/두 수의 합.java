import java.math.*;

class Solution {
    public String solution(String a, String b) {
        // String answer = String.valueOf(Long.parseLong(a) + Long.parseLong(b));
        
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        BigInteger sum = numA.add(numB);
        
        return sum.toString();
    }
}
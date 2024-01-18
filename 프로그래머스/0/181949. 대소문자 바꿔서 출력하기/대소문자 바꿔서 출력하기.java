import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for (char ch : a.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                answer += String.valueOf(ch).toUpperCase();
            }
            
            if (ch >= 'A' && ch <= 'Z') {
                answer += String.valueOf(ch).toLowerCase();
            }
        }
        
        System.out.print(answer);
    }
}
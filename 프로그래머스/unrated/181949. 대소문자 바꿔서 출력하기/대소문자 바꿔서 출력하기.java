import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int check = 1;
        int check2 = 20;
        String answer = "";
        
        if(check<=str.length() && check2>=str.length()) {    
            for(char c : str.toCharArray()) {
                if(Character.isUpperCase(c)) {
                    answer += Character.toLowerCase(c);
                } else {
                    answer += Character.toUpperCase(c);
                }
            }
        }
        
        System.out.print(answer);
        
    }
}
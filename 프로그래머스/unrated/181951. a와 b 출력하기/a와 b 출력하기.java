import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int check = -100000;
        int check2 = 100000;
        
        if(check<=a && check2>=a && check<=b && check2>=b) {
             System.out.println("a = " + a);
             System.out.println("b = " + b);
        }
    }
}
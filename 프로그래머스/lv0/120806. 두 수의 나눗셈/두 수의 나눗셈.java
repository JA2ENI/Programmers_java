class Solution {
    public int solution(int num1, int num2) {
        int check = 0;
        int check2 = 100;
        double answer = 0.0;

        
        if(check<=num1 && check2>=num1 && check<=num2 && check2>=num2) {
            answer = (double)num1/num2*1000;
        }
        return (int)answer;
    }
}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = (numer1*denom2) + (numer2*denom1);
        int num2 = denom1 * denom2;
        
        for(int i = num-1; i>1; i--) {
            if(num%i==0 && num2%i == 0) {
                num /= i;
                num2 /= i;
            }
        }
        
        int[] answer = {num, num2};
        return answer;
    }
}
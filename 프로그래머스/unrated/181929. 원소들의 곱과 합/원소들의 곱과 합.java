class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int cal = 0;
        double a = 1.0;
        double b = 0.0;
        
        for(int i=0; i<num_list.length; i++) {
            cal = num_list[i];
            a *= cal;
            b += cal;
        }       
        b = Math.pow(b, 2);
        
        answer = (a < b) ? 1 : 0;
        
        return answer;
    }
}
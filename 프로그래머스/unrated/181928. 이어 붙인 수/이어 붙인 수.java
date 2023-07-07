class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for(int i=0; i<num_list.length; i++) {
            answer = num_list[i];
            if(answer%2==0) {
                even += answer;
            } else {
                odd += answer;
            }
        }
        
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return answer;
    }
}
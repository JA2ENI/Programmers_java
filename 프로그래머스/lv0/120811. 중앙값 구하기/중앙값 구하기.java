import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int size = 0;
        int size2 = 100;
        int num = -1000;
        int num2 = 1000; 
        int answer = 0;
        
        if(size<array.length && size2>array.length) {
            for(int i=0; i<array.length; i++) {
                int check = array[i];             
                if(num<check && num2>check) {
                    Arrays.sort(array);
                    answer = array[array.length/2];
                }
            }
        }
  
        return answer;
    }
}
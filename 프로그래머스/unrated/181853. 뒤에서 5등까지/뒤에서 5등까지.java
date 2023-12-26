import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(num_list);
        for(int i=0;i<5;i++)
        {
            answer.add(num_list[i]);
        }
        return answer;
    }
}
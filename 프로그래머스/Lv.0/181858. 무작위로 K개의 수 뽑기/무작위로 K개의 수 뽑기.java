import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer= new ArrayList<>();
        answer.add(arr[0]);

        for(int i=1;i<arr.length;i++)
        {
            if(answer.contains(arr[i]))
            {
                continue;
            }
            else 
                answer.add(arr[i]);
            if(answer.size()==k)
            {
                break;
            }
        }
        if(answer.size()-1!=k)
        {
            while(answer.size()!=k) {
                answer.add(-1);
            }
        }
        return answer;
    }
}
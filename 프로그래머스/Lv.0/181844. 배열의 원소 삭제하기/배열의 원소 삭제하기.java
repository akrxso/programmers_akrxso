import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer= new ArrayList<>();
        ArrayList<Integer> delList= new ArrayList<>();
        for(int i :delete_list)
        {
            delList.add(i);
        }
        for(int i: arr)
        {
            if(delList.contains(i))
            {
                continue;
            }
            else
                answer.add(i);
        }
        return answer;
    }
}
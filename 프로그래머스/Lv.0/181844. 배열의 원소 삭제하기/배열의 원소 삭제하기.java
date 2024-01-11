import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer= new ArrayList<>();
        ArrayList<Integer> delList= new ArrayList<>();
        for(int i=0;i<delete_list.length;i++)
        {
            delList.add(delete_list[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(delList.contains(arr[i]))
            {
                continue;
            }
            else
                answer.add(arr[i]);
        }
        return answer;
    }
}
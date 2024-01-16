import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int start=0;
        int last = arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2)
            {
                break;
            }
            start++;
        }
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]==2)
            {
                break;
            }
            last--;
        }
        if(start==arr.length)
        {
            answer.add(-1);
        }
        for(int i=start;i<=last;i++)
        {
            answer.add(arr[i]);
        }
        return answer;
    }
}
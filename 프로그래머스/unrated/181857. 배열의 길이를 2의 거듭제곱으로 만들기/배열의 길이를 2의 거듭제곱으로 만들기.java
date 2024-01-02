import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer=new ArrayList<>();
        int count =0;
        int sq=1;
        int value=arr.length;
        while (value!=1)
        {
            value=value/2;
            count++;
        }
        while ((count+1)!=0)
        {
            if(sq==arr.length)
                break;
            else {
                sq = 2 * sq;
                count--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            answer.add(arr[i]);
        }
        for(int i=arr.length;i<sq;i++)
        {
            answer.add(0);
        }
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        int start1 = intervals[0][0];
        int start2 = intervals[1][0];
        int end2 = intervals[1][1];
        for(int i=0;i<2;i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];
            for(int j=start;j<=end;j++) {
                answer.add(arr[j]);
            }
        }
        return answer;
    }
}
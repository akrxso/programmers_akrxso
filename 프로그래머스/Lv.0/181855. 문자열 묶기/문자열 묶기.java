import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int arr[] = new int[30];
        for(int i=0;i<strArr.length;i++)
        {
            int count=0;
            count=strArr[i].length();
            arr[count-1]++;
        }
        Arrays.sort(arr);
        return answer=arr[29];
    }
}
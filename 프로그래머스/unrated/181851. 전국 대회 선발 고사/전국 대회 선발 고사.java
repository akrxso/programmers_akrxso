import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int arr[][]= new int[rank.length][2];
        ArrayList<Integer> count= new ArrayList<>();
        int a = 0,b=0,c=0;
        for (int i = 0; i < rank.length; i++) {
            arr[i][0] = rank[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (s, h) -> Integer.compare(s[0], h[0]));

        int d=0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[arr[i][1]]==true) {
                    count.add(arr[i][1]);
            }
        }
        for(int i=0;i<count.size();i++)
        {
            if(i==0)
                a=10000*count.get(i);
            if(i==1)
                b=100*count.get(i);
            if(i==2)
                c=count.get(i);
        }

        return answer=a+b+c;
    }
}
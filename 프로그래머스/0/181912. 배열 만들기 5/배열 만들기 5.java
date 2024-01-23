import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] newStrs=new String[intStrs.length];
        for(int i=0;i<intStrs.length;i++)
        {
            newStrs[i]=intStrs[i].substring(s,s+l);
            if(Integer.parseInt(newStrs[i])>k)
                answer.add(Integer.parseInt(newStrs[i]));
        }
        return answer;
    }
}
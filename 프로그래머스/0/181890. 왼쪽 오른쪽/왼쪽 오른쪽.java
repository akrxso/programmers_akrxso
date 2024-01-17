import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        int count=0;
        String a="";
        for(int i=0;i<str_list.length;i++)
        {
            if(str_list[i].equals("l")||str_list[i].equals("r"))
            {
                a=str_list[i];
                break;
            }
            count++;
        }
        
        if(a.equals("l"))
        {
            for(int i=0;i<count;i++)
            {
                answer.add(str_list[i]);
            }
        }
        else if(a.equals("r"))
        {
            for(int j=count+1;j<str_list.length;j++)
            {
                answer.add(str_list[j]);
            }
        }

        return answer;
    }
}
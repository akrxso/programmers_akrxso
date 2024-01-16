import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        String [] arr= myString.split("x");
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int count =0;
            for(int j=0;j<arr[i].length();j++)
            {
                count++;
            }
            answer.add(count);
        }
        if(myString.charAt(myString.length()-1)=='x')
        {
            answer.add(0);
        }
            return answer;
    }
}
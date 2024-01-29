import java.util.ArrayList;

class Solution {
    public String solution(int age) {
        String answer = "";
        String a=age+"";
        for(int i=0;i<a.length();i++)
        {
            answer+=(char)(a.charAt(i)+49);
        }
        return answer;
    }
}
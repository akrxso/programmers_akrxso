import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        my_string =my_string.trim();
        StringTokenizer st = new StringTokenizer(my_string," ");
        answer = new String[st.countTokens()];
        
        int i=0;
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            answer[i]= token;
            i++;
        }
        return answer;
    }
}
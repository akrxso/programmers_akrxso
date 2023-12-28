import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString,"x");
        String[] answer = new String[st.countTokens()];
        int i=0;
        while (st.hasMoreTokens())
        {
            String s = st.nextToken();
            answer[i]=s;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
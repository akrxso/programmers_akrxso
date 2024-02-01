import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            if(set.add(my_string.charAt(i)))
            {
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] names) {
        ArrayList<String> a = new ArrayList<>();
        for(int i=0; i< names.length;i+=5)
        {
            a.add(names[i]);
        }
        return a;
    }
}
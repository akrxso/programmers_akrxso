import java.util.ArrayList;

class Solution {
    public ArrayList solution(String[] strArr) {
        ArrayList<String> a = new ArrayList<>();
        for(int i=0;i<strArr.length;i++)
        {
            if(strArr[i].contains("ad"))
            {
                continue;
            }
            else
                a.add(strArr[i]);
        }
        return a;
    }
}
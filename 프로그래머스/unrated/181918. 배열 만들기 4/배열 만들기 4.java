import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for(int i=0;i<arr.length;) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (arr[i]>stk.get(stk.size()-1)) {
                stk.add(arr[i]);
                i++;
            }
            else
            {
                stk.remove(stk.size()-1);
            }
        }
        return stk;
    }
}
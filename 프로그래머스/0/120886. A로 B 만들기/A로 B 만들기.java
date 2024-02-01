import java.util.HashMap;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        HashMap<Character,Integer>hashB= new HashMap<>();
        HashMap<Character,Integer>hashA= new HashMap<>();
        for(int i=0;i<before.length();i++)
        {
           hashB.put(before.charAt(i), hashB.getOrDefault(before.charAt(i),0)+1);
        }
        for(int i=0;i<after.length();i++)
        {
            hashA.put(after.charAt(i), hashA.getOrDefault(after.charAt(i),0)+1);
        }
        if (hashB.equals(hashA)) 
            answer=1;
        return answer;
    }
}
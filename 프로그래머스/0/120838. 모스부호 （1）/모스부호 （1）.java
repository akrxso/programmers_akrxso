import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,Character> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hash.put(arr[i],(char)(i+97));
        }
        String[] l=letter.split(" ");//공백단위로 끊어라
        for(String i:l)
        {
            if(hash.containsKey(i)) {
                answer+=hash.get(i);
            }
        }
        return answer;
    }
}
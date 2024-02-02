class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp=1;
        while(n>=temp)
        {
            temp=temp*(++answer);
        }
        return answer-1;
    }
}
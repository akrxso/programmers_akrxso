class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s="";
        int count=0;
        for(int a=i;a<=j;a++)
        {
            s=Integer.toString(a);//string으로 바꿔라
            for(int b=0;b<s.length();b++)
            {
                if(s.charAt(b)==k+48)
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}
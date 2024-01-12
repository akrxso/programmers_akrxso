class Solution {
    public int solution(String binomial) {
        int answer = 0;
        if (binomial.contains("+")) {
            String[] b = binomial.split("\\+");
            b[0]=b[0].trim();
            b[1]=b[1].trim();
            answer=Integer.parseInt(b[0])+Integer.parseInt(b[1]);
        } else if (binomial.contains("-")) {
            String[] b = binomial.split("\\-");
            b[0]=b[0].trim();
            b[1]=b[1].trim();
            answer=Integer.parseInt(b[0])-Integer.parseInt(b[1]);
        } else {
            String[] b = binomial.split("\\*");
            b[0]=b[0].trim();
            b[1]=b[1].trim();
            answer=Integer.parseInt(b[0])*Integer.parseInt(b[1]);
        }
        return answer;
    }
}
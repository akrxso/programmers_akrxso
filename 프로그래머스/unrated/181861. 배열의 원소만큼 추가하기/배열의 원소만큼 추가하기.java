class Solution {
    public int[] solution(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        int[] answer = new int[sum];

        int index=0;
        int count=0;
        
        for(int i=0;i<answer.length;i++)
        {
            answer[i]=arr[index];
            count++;
            if(arr[index]==count)
            {   count=0;
                index++;
            }
            
        }
        return answer;
    }
}
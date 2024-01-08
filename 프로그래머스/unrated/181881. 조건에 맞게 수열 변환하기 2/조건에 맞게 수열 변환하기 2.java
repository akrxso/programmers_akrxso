class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (!same(arr,arr2(arr)))
        {
            arr=arr2(arr);
            answer++;
        }
        return answer;
    }
    private int[] arr2(int[] arr)
    {
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=50&&arr[i]%2==0)
            {
                arr2[i]=arr[i]/2;
            } else if (arr[i]<50&&arr[i]%2!=0) {
                arr2[i]=(arr[i]*2)+1;
            }
            else 
                arr2[i]=arr[i];
        }
        return arr2;
    }

    private boolean same(int[] arr,int[] arr2)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }

}
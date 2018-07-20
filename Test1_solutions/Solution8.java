public class Solution8 { 
    public int solution(int[] A){
        int[] arr = new int[A.length];
        for(int a: A)
            arr[a-1] =1;
        for(int i=0; i<arr.length; i++)
            if(arr[i]==0) return i+1;
        return -1;
    }

    public static void main(String[] args){
        int[] A = new int[]{1,3,6,4,1,2};
        Solution8 s = new Solution8();
        System.out.println(s.solution(A));  
    }
}

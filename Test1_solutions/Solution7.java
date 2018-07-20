public class Solution7 { 
public int[] solution(int[] A, int K) {
        K %= A.length;
        reverse(A, 0, A.length - 1);
        reverse(A, 0, K - 1);
        reverse(A, K, A.length - 1);
return A;
    }

    public void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
       }
    }
public static void main(String[] args){
        int[] A = new int[]{1,3,6,4,1,2};
        Solution7 s = new Solution7();
        s.solution(A, 2);
        
        for(int a: A)
        System.out.print(a+" ");
    }
}
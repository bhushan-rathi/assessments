public class Solution10 {
	int solution(int[] A, int N) {
		
		int total = (N * (N + 1)) / 2;
		boolean[] b = new boolean[N];
		int sum = 0;
		
		for(int a : A){
			sum += a;
			if(b[a%N])
				return 0;
			b[a%N] = true;
		}
	return total-sum==0?1:0;
    }

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int[] arr;
		
		arr = new int[] {4, 1, 3, 2};
		System.out.println(s.solution(arr, arr.length));
		
		arr = new int[] {4, 1, 3};
		System.out.println(s.solution(arr, arr.length));
	}
}

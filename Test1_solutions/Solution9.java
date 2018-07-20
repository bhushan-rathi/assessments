public class Solution9 {
	int solution(int[] A) {
		int count = 0;
		int sum = 0;
		for(int i = A.length - 1; i >= 0; i--) {
			if(A[i] == 0)
				sum += count;
			else if(A[i] == 1)
				count++;

			if(count > 1000000000)
				return -1;
		}
		return sum;
	}

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		int[] arr = new int[] {0, 1, 0, 1, 1};
		System.out.println(s.solution(arr));
	}
}

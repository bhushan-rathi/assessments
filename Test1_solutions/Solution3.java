public class Solution3 { 
	boolean array123(int[] arr){
		StringBuffer sb = new StringBuffer();
		
		for(int a: arr){
		    sb.append(a);
		    sb.append("$");
		}
		
		String s = String.valueOf(sb);
		String s1 = "1$2$3";
		return s.contains(s1);
	}

	public static void main(String[] args) {
	    int[] arr ;
	    Solution3 s = new Solution3();
	    
	    arr = new int[]{1,3,4,5,1,2,3};
		System.out.println(s.array123(arr));
		
		arr = new int[]{1, 1, 2, 3, 1};
		System.out.println(s.array123(arr));
		
		arr = new int[]{1, 1, 2, 4, 1};
		System.out.println(s.array123(arr));
		
		arr = new int[]{1, 1, 2, 1, 2, 3};
		System.out.println(s.array123(arr));
	}
}

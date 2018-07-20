public class Solution4 { 
	String repeatFront(String str, int n){
		if(n < 0 && n > str.length())
			return null;
		StringBuilder sb = new StringBuilder();
		for(int i = n; i > 0; i--)
			sb.append(str.substring(0,i));
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.repeatFront("Chocolate", 4));
		System.out.println(s.repeatFront("Chocolate", 3));
		System.out.println(s.repeatFront("Ice Cream", 2));
	}
}

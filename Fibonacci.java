public class Fibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int nextTerm;
        int sum = 2;
		while(true) {
			nextTerm = a + b;
			// test the condition here
			if(nextTerm > 4000000) break;
			if(nextTerm % 2 == 0) {
                sum = sum + nextTerm;
			}
			//System.out.println(nextTerm);
			a = b;
			b = nextTerm;
		}
		System.out.println(sum);
	}
}


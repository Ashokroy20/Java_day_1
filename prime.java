package for_3;

public class prime {
	public static void main (String[]args) {
		for(int i=100; i<=1000; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i+" is Prime");
			}
		}
	}

}

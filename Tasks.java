package For_loop;

public class Tasks {
	public static void main(String[]args) {

//		String a = "Nisha";
//		String x="";
//		for (int i=a.length()-1; i>=0; i--) { 
//			x=x+a.charAt(i);
//		}
//		System.out.println(x);
//		
//		String b = "Java";
//		String total = ""; 
//		for (char i=0; i<= b.length()-1;i++) {
//			total = total+b.charAt(i);
//			System.out.println(total);
//		}
//		
//		String c = "java";
//		String s = "";
//		for (int i=c.length()-1; i>=0; i--) {
//			s = s+c.charAt(i);
//		}
//		if (c.equals(s)) {
//			System.out.println("palindrome word");
//			
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
//		
//		int a = 13;
//		boolean isPrime = false;
//		for (int i=1; i<=a; i++) {
//			if (a%i==0) {
//				isPrime = true;
//			}
//		}
//		if (isPrime==true) {
//			System.out.println("Prime Number");
//		}
//		else {
//			System.out.println("Not a prime number");
//		}
		
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i=0; i<12; i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}



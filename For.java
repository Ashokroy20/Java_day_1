package For_loop;

public class For {
	public static void main (String[]args) {
		
//		for (int i=0; i<=20; i++) {
//			System.out.println(i);
//		}
//		for (int i=5; i>=0; i--) {
//			System.out.println(i);
//		}
//	
//		String a = "Ashok";
//		for (int i=0; i<a.length(); i++) {
//			System.out.println(a.charAt(i));
//		}
//		String a = "Dhivya";
//		for (int i=a.length()-1; i>=0; i--) {
//			System.out.println(a.charAt(i));
//		}
		
//		for (int i=1; i<=20; i++) {
//			if (i%2!=0) {
//			System.out.println(i);
//			}
//			}
//		String name = "nisha";
//		
//		for (int i=0; i<name.length(); i++) {
//			if (name.charAt(i)=='n'||name.charAt(i)=='a'||name.charAt(i)=='s') {
//			System.out.println(name.charAt(i));
//		}
//		}
		
//		int total = 0;
//		for (int i=0; i<=24; i++) {
//			total = total+i; 
//		}
//		System.out.println(total);
//		
//		int total1 = 0;
//		for (int i=12; i>=0; i--) {
//			total1 = total1-i;			
//		}
//		System.out.println(total1);
//		
//		int total2 = 1;
//		for (int i=1; i<=12; i++) {
//			total2 = total2*i;
//		}
//		System.out.println(total2);
//		
//		int a = 0;
//		for (int i=0; i<=7; i++) {
//			a = a+i;
//			System.out.println(a);
//		}
		String name = "chennai";
		int total3 =0;
		
		for (int i=0; i<=name.length()-1; i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
			total3 = total3+1;
		}
			}
		System.out.println(total3);
		
	}

}

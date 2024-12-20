package for_3;

public class Palindrom {
	public static void main (String[]args) {
		int num = 343;
		int palindrome = 0;
		int temp = num;
		while(num>0) {
			int a = num%10;
			palindrome = (palindrome*10)+a;
			num = num/10;
		}
		if(temp==palindrome) {
			System.out.println(temp+" is Palindrome");
		}
		else {
			System.out.println(temp+" Not a Palindrome");
		}
	}

}

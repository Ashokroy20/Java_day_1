package for_3;

public class Amstrong_num {
	public static void main (String[]args) {
		int num = 999;
		int temp = num;
		int am = 0;
		int total = 0;
		for(int i=100; i<=num; i++) {
			boolean isAmstrong = true;
			for(int j=i+1; j<=i; j++) {
				
		while(num>0) {
			int a = num%10;
			am = am+(a*a*a);
			num = num/10;
			total=total+num ;
			isAmstrong = false;
		}
			}
		if(isAmstrong) {
			System.out.println(total+" is Amstrong Number");
		}
		else {
			System.out.println("Not a Amstrong Number");
		}
			
	  }
	}

}

package for_3;

public class While {
	public static void main (String[]args) {
		int num = 1489;
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}
		System.out.println(count);
	}

}

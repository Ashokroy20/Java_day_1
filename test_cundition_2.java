package For_loop;

public class test_cundition_2 {
	public static void main (String[]args) {
		String str = "NiShAnTHi";
		int upper = 0;
		int lower = 0;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch>='A' && ch<='Z')
				upper++;
			else if (ch>='a' && ch<='z')
				lower++;
		}
		System.out.println("Upper count is "+upper);
		System.out.println("Lower count is "+lower);
	
	}

}

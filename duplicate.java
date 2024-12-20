package for_3;

public class duplicate {
	public static void main (String[]args) {
		String a = "banana";
		char[] b = a.toCharArray();
		int duplicate = 0;
		for(int i=0; i<b.length; i++) {
			
			int count = 1;
			for(int j=i+1; j<b.length; j++) {
				if (b[i]==b[j]) {
					b[j] = '$';
					count++;	
				}
			}
			if (count>1 && b[i]!='$') {
				System.out.println(b[i]+" "+count);
				duplicate= count+1;
			}
		}

		System.out.println(duplicate);
	}
}

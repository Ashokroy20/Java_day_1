package for_3;

public class Array_equals_check {
	public static void main (String[]args) {
		int[] a = {10,20,30,50,40};
		int[] b = {10,30,20,40,50};
		boolean isEqual = true;
		if(a.length==b.length) {
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a.length; j++) {
					if(a[i]==b[j]) {
						a[i]=0;
					}
				}
				if(a[i]!=0) {
					isEqual = false;
				}
			}
			if(isEqual) {
				System.out.println("Array are equal");
			}
			else {
				System.out.println("Array are not equal");
			}
		}
		else {
			System.out.println("Array length Not Equal");
		}
	}

}

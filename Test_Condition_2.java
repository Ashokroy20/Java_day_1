package For_loop;

public class Test_Condition_2 {
	public static void main (String[]args) {
		int a = 20;
		for (int i=0; i<=a; i++) {
			if (i%2!=0) {
				
			
				System.out.println("odd numbers:"+i+" Square = "+(i*i));
			} else {
			System.out.println("even number:"+i+" Cube = "+(i*i*i));
		}
		}
	}

}

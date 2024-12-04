package Day_1;

public class Percentage {
	public static void main (String[]args)
	{
		int amount = 120000;
		float taxpercent = 8.5f;
		float intrest = amount* taxpercent/100;
		float netamount = amount + intrest;
		System.out.println("The intrest Amount of "+amount+" is "+intrest+" \n"+"And The netamount is "+ netamount);
		
	}

}

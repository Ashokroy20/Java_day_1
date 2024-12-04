package Day_1;

public class useemployee {
	public static void main (String[]args) 
	{
	Employee e1 = new Employee();
	e1.name = "Ashokkumar";
	e1.id = 17;
	e1.ismale = true;
	System.out.println(e1.name+" "+e1.id);
	Employee e2 = new Employee();
	e2.name = "Barathkumar";
	e2.id = 11;
	e2.ismale = true;
	System.out.println(e2.name+" "+e2.id);
	
	Employee e3 = new Employee();
	e3.name = "Dhivya";
	e3.id = 24;
	e3.ismale=false;
	System.out.println(e3.name+" "+e3.id);
	Employee e4 = new Employee();
	e4.name = "Sundaramoorthy";
	e4.id= 1137;
	e4.ismale = true;
	System.out.println(e4.name+" "+e4.id);
	}

}

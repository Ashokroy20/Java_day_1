package oops;

public class Oops_1 {
	public static void main (String[]args) {
		Engine e1 = new Engine();
		e1.brand = "VW";
		e1.cc = 1600;
		e1.price= 12000;
		Car c1 = new Car();
		c1.brand = "VW";
		c1.price= 1200000;
		c1.engine = e1;
		System.out.println(c1.brand+" \n"+c1.price+" \n"+c1.engine.brand+"\n "+c1.engine.cc+"\n "+c1.engine.price);
	}

}

 class Engine {
	String brand;
	int cc;
	int price;
	
}
 class Car {
	 String brand;
	 int price;
	 Engine engine;
 }
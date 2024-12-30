package oops;

public class Constructor {
	public static void main (String[]args) {
	Battery1 b1 = new Battery1(100,"li");
	System.out.println(b1);
	Laptop l1 = new Laptop("Dell", 35000, b1);
	System.out.println(l1);
	}
}

class Laptop {
	private String brand;
	private int price;
	private Battery1 battery; 
	public Laptop (String brand, int price, Battery1 battery) {
		this.brand = brand;
		this.price = price;
		this.battery = battery;
	}
	public String toString() {
		return brand+" "+price+" "+battery;
	}
}

class Battery1 {
	private int capacity;
	private String type;
	public Battery1(int capacity, String type) {
		this.capacity=capacity;
		this.type=type;
	}
	public String toString() {
		return capacity+" "+type;
	}
}

package oops;

public class Constructor_1 {
	public static void main (String[]args) {
	Displays d1 = new Displays("UHD",6.1f);
	Phone p1 = new Phone("Apple", 40000, "XR", 3600, d1);
	p1.setPrice(p1.getPrice()*15/100+p1.getPrice());
	
	System.out.println(p1);
	}
}

class Phone {
	private String brand;
	private int price;
	private String model;
	private int battery;
	private Displays display;
	public Phone (String brand, int price, String model, int battery, Displays display) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.battery = battery;
		this.display = display;
	}
		public void setPrice (int price) {
			
			this.price = price;
			
		}
		public int getPrice () {
			return price;
		
	}
	public String toString() {
		return brand+" "+price+" "+model+" "+battery+" "+display;
	}
}
class Displays {
	private String ress;
	private float size;
	public Displays (String ress, float size) {
		this.ress = ress;
		this.size = size;
	}
	public String toString() {
		return ress+" "+size;
	}
}

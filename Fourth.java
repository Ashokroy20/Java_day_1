package oops;

public class Fourth {
public static void main (String[]args) {
	Sketch ske = new Sketch();
	ske.setBrand("ABC");
	ske.setPrice(860);
	ske.setColor("Black");
	
	Sketch ske1 = new Sketch();
	ske1.setBrand("ABC");
	ske1.setPrice(450);
	ske1.setColor("Black");
	
	Sketch ske2 = new Sketch();
	ske2.setBrand("ABC");
	ske2.setPrice(540);
	ske2.setColor("Black");
	
	int[] sket = {ske.getPrice(),ske1.getPrice(),ske2.getPrice()};
	for(int i=0; i<sket.length; i++) {
		
		System.out.println((ske.getPrice()+ske1.getPrice()+ske2.getPrice())/3);
	}
}
}

class Sketch {
	private String brand;
	private int price;
	private String color;
	public void setBrand (String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor (String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
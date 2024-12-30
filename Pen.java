package oops;

public class Pen {
	public static void main (String[]args) {
		colors c1 = new colors();
		c1.setColor1("Blue");
		c1.setColor2("Green");
		UsePen p1 = new UsePen();
		p1.setBrand("Cello");
		p1.setPrice(12);
		p1.setColor(c1);
		System.out.println(p1.getBrand()+" "+p1.getPrice()+" "+p1.getColor().getColor1());
	}

}

class UsePen {
	private String brand;
	private int price;
	private colors color; 
	public void setBrand (String brand) {
		this.brand = brand;
	}
	public String getBrand () {
		return brand;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrice () {
		return price;
	}
	public void setColor (colors color) {
		this.color = color;
	}
	public colors getColor () {
		return color;
	}
}
class colors {
	private String color1;
	private String color2;
	public void setColor1 (String color1) {
		this.color1= color1;
	}
	public String getColor1 () {
		return color1;
	}
	public void setColor2 (String color2) {
		this.color2 = color2;
	}
	public String getColor2 () {
		return color2;
	}
}

package oops;

public class Question_paper {
	public static void main (String[]args) {
		Stapler s1 = new Stapler();
		s1.setBrand("Camel");
		s1.setPrice(120);
		s1.setColor("Blue");
		s1.setMaterial("Silver");
		
		Stapler s2 = new Stapler();
		s2.setBrand("Cello");
		s2.setPrice(125);
		s2.setColor("Black");
		s2.setMaterial("Iron");
		
		Stapler s3 = new Stapler();
		s3.setBrand("Nike");
		s3.setPrice(250);
		s3.setColor("Red");
		s3.setMaterial("Gold");
		
		String[] str = {s1.getBrand(),s2.getBrand(),s3.getBrand()};
		
		for(int i=0; i<str.length; i++) {
			
			System.out.println(str[i]);
		}
	}

}

class Stapler {
	private String brand;
	private int price;
	private String color;
	private String material;
	public void setBrand (String brand) {
		this.brand= brand;
	}
	public String getBrand () {
		return brand;
	}
	public void setPrice (int price) {
		this.price= price;
	}
	public int getPrice () {
		return price;
	}
	public void setColor (String color) {
		this.color= color;
	}
	public String getColor () {
		return color;
	}
	public void setMaterial (String material) {
		this.material= material;
	}
	public String getmaterial () {
		return material;
	}
	
}
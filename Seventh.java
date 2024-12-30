package oops;

public class Seventh {
	public static void main (String[]args) {
		Telephone t1 = new Telephone();
		t1.setBrand("Jio");
		t1.setPrice(6000);
		t1.setColor("red");
		t1.setIswireless(true);
		
		Telephone t2 = new Telephone();
		t2.setBrand("Oppo");
		t2.setPrice(12000);
		t2.setColor("Black");
		t2.setIswireless(true);
		Telephone t3 = new Telephone();
		t3.setBrand("Bsnl");
		t3.setPrice(3000);
		t3.setColor("red");
		t3.setIswireless(false);
		
		boolean[] tele = {t1.getIswireless(),t2.getIswireless(),t3.getIswireless()};
		int count = 0;
		for(int i=0; i<tele.length; i++) {
			if(tele[i]==true) {
				count++;
			}
		}
		System.out.println(count);
	}

}

class Telephone {
	private String brand;
	private int price;
	private String color;
	private boolean iswireless;
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
	public void setColor (String color) {
		this.color = color;
	}
	public String getcolor () {
		return color;
	}
	public void setIswireless (boolean iswireless) {
		this.iswireless = iswireless;
	}
	public boolean getIswireless () {
		return iswireless;
	}
}
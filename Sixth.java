package oops;

public class Sixth {
	public static void main (String[]args) {
		Mask m1 = new Mask();
		m1.setBrand("Ask");
		m1.setPrice(650);
		m1.setColor("gold");
		m1.setIsn95(true);
	
		Mask m2 = new Mask();
		m2.setBrand("fsk");
		m2.setPrice(250);
		m2.setColor("gold");
		m2.setIsn95(true);
		
		Mask m3 = new Mask();
		m3.setBrand("wsk");
		m3.setPrice(550);
		m3.setColor("gold");
		m3.setIsn95(true);
		
		int[] masks = {m1.getPrice(),m2.getPrice(),m3.getPrice()};
		
		int high = masks[1];
		for(int i=0; i<masks.length; i++) {
			if(masks[i]>=masks[1]) {
				high = masks[i];
			}
		}
		System.out.println(high);
	}

}

class Mask {
	private String brand;
	private int price;
	private String color;
	private boolean isN95;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand () {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice () {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor () {
		return color;
	}
	public void setIsn95(boolean isN95) {
		this.isN95 = isN95;
	}
	public boolean getIsN95 () {
		return isN95;
	}
}
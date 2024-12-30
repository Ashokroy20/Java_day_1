package oops;

public class Thired {
	public static void main (String[]args) {
		StickPen pen1 = new StickPen();
		pen1.setBrand("Camel");
		pen1.setPrice(25);
		pen1.setColor("Blue");
		pen1.setIsPlastic(false);
		pen1.setTipwidth(0.5f);
		
		StickPen pen2 = new StickPen();
		pen2.setBrand("Cello");
		pen2.setPrice(15);
		pen2.setColor("Black");
		pen2.setIsPlastic(true);
		pen2.setTipwidth(0.7f);
		
		StickPen pen3 = new StickPen();
		pen3.setBrand("Butterflow");
		pen3.setPrice(18);
		pen3.setColor("Blue");
		pen3.setIsPlastic(true);
		pen3.setTipwidth(1.5f);
		
		int[] pens = {pen1.getPrice(),pen2.getPrice(),pen3.getPrice()};
		int count = 0;
		for(int i=0; i<pens.length; i++) {
			count = count+pens[i];
		}
		System.out.println(count);
	}

}

class StickPen {
	private String brand;
	private int price;
	private String color;
	private boolean isPlastic;
	private float tipwidth;
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
	public void setIsPlastic(boolean isPlastic) {
		this.isPlastic = isPlastic;
	}
	public boolean getIsPlastic () {
		return isPlastic;
	}
	public void setTipwidth(float tipwidth) {
		this.tipwidth = tipwidth;
	}
	public float getTipwidth () {
		return tipwidth;
	}
	
}

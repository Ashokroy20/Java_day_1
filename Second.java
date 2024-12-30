package oops;

public class Second {
	public static void main (String[]args) {
	WaterBottle bottle = new WaterBottle();
	bottle.setBrand("Nike");
	bottle.setPrice(260);
	bottle.setcolor("Red");
	bottle.setIsPlastic(true);
	
	WaterBottle bottle1 = new WaterBottle();
	bottle1.setBrand("Milton");
	bottle1.setPrice(460);
	bottle1.setcolor("Blue");
	bottle1.setIsPlastic(false);
	
	WaterBottle bottle2 = new WaterBottle();
	bottle2.setBrand("Adidas");
	bottle2.setPrice(760);
	bottle2.setcolor("Black");
	bottle2.setIsPlastic(true);
	
	boolean[] set = {bottle.gatIsPlastic(),bottle1.gatIsPlastic(),bottle2.gatIsPlastic()};
	int count = 0;
	for(int i=0; i<set.length; i++) {
	if(set[i]==true) {
		count++;
	}
	}
	System.out.println(count);
	}
}


class WaterBottle {
	private String brand;
	private int price;
	private String color;
	private boolean isPlastic;
	public void setBrand (String brand) {
		this.brand = brand;
	}
	public String gatBrand () {
		return brand;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public int gatprice () {
		return price;
	}
	public void setcolor (String color) {
		this.color = color;
	}
	public String gatcolor () {
		return color;
	}
	public void setIsPlastic (boolean isPlastic) {
		this.isPlastic = isPlastic;
	}
	public boolean gatIsPlastic () {
		return isPlastic;
	}
}
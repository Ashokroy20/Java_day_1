package oops;

public class Encapsulation {
	public static void main (String[]args) {
		Compressor c1 = new Compressor ();
		c1.setBrand("Onida");
		c1.setPrice(1350);
		Ac ac1 = new Ac();
		ac1.setBrand("Voltas");
		ac1.setPrice(15000);
		ac1.setComp(c1);
		System.out.println(ac1.getBrand()+"\n "+ac1.getPrice()+"\n "+ac1.getComp().getPrice()+"\n "+ac1.getComp().getBrand());
	}
	

}

class Ac {
	private String brand ;
	private int price ;
	private Compressor comp;
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
	public void setComp (Compressor comp) {
		this.comp = comp;
	}
	public Compressor getComp () {
		return comp;
	}
}

class Compressor {
	private String brand ;
	private int price ;
	
	public String getBrand () {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public int getPrice () {
		return price;
		
	}
	public void setPrice (int price) {
		this.price = price;
	}
	
}

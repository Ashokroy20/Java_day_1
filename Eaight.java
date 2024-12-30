package oops;

public class Eaight {
	public static void main (String[]args) {
		Tablefan t1 = new Tablefan("Crompton",2650,"Black","Cp","AC");
		Tablefan t2 = new Tablefan("Onida",4850,"Black","ON","AC");
		Tablefan t3 = new Tablefan("Philips",9640,"Black","PL","AC");
		t1.setPrice(t1.getPrice()*10/100+t1.getPrice());
		t2.setPrice(t2.getPrice()*10/100+t2.getPrice());
		t3.setPrice(t3.getPrice()*10/100+t3.getPrice());
		System.out.println(t1+"\n"+t2+"\n"+t3);
	}

}

class Tablefan {
	private String brand;
	private int price;
	private String color;
	private String logo;
	private String powersource;
public Tablefan (String brand, int price, String color, String logo, String powersource) {
	this.brand=brand;
	this.price= price;
	this.color=color;
	this.logo= logo;
	this.powersource=powersource;
}
public void setPrice (int price) {
	this.price = price;
}
public int getPrice () {
	return price;
}
public String toString () {
	return brand+" "+price+" "+color+" "+logo+" "+powersource;
}
}
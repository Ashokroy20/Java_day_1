package oops;

public class Five {
	public static void main (String[]args) {
		Flights f1 = new Flights();
		f1.setBrand("ABC");
		f1.setPrice(860);
		f1.setColor("Black");
		f1.setNoofseats(920);
		
		Flights f2 = new Flights();
		f2.setBrand("ABC");
		f2.setPrice(450);
		f2.setColor("Black");
		f2.setNoofseats(640);
		
		Flights f3 = new Flights();
		f3.setBrand("ABC");
		f3.setPrice(540);
		f3.setColor("Black");
		f2.setNoofseats(18);
		
		int[] sket = {f1.getNoofseats(),f2.getNoofseats(),f3.getNoofseats()};
		for(int i=0; i<sket.length; i++) {
			if(sket[i]>=800) {
				System.out.println("SupperJumbo");
			}
			else if(sket[i]<20) {
				System.out.println("Minimum Seat");
			}
			else {
				System.out.println("Normal");
			}
 		}
	}
}

class Flights {
		private String brand;
		private int price;
		private String color;
		private int noofseats;
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
		public void setNoofseats (int noofseats) {
			this.noofseats = noofseats;
		}
		public int getNoofseats() {
			return noofseats;
		}
	}



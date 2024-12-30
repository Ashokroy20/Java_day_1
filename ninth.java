package oops;

public class ninth {
	public static void main (String[]args) {
	Noval n1 = new Noval(1489,"Filender","Love story",1600,143);
	Noval n2 = new Noval(1469,"John","Life of Education",2148,411);
	Noval n3 = new Noval(1724,"Polo","Real Love story",4600,186);
	String[] pri = {n1.getAuthor(),n2.getAuthor(),n3.getAuthor()};
	String a = pri[1];
	String b = "";
	for(int i=0; i<pri.length; i++) {
		if(pri[i].equals(pri[1])) {
			pri[1]=pri[i];
		}
	}
	if(a.equals(b)) {
		System.out.println("SAME AUTHOR");
	}
	else {
		System.out.println("Different Author");
	}
	}

}

class Noval {
	private int id;
	private String author;
	private String title;
	private int price;
	private int pages;
	public Noval (int id, String author, String title, int price, int pages) {
		this.id = id;
		this.author = author;
		this.title = title;
		this.price = price;
		this.pages = pages;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setAuthor (String author) {
		this.author = author;
	}
	public String getAuthor () {
		return author;
	}
	public String toString () {
		return id+" "+author+" "+title+" "+price+" "+pages; 
	}
}
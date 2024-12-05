package Day_2;

public class Test_day_2 {
public static void main (String[]args)
{
	String name = "Barathkumar";
	String name1 = name.toUpperCase();
	int a = name.length();
	System.out.println(a+" "+name1);
	
	String b = "SUNDARAMOORTHY";
	String b1 = b.toLowerCase();
	int c = b.length();
	System.out.println(c+" "+b1);
	
	String d = "microsoft woarld";
	boolean d1 = d.contains("soft");
	boolean d2 = d.endsWith("v");
	System.out.println(d1+" "+d2);
	
	String e = "Apple";
	int e1 = e.indexOf("A");
	System.out.println(e1);
	
	String f = "Girl";
	String f1 = "Army";
	boolean f2 = f.equals(f1);
	System.out.println(f2);
	
	String g = "wonder land";
	String g1 = "Wonder Land";
	boolean g2 = g.equalsIgnoreCase(g1);
	System.out.println(g2);
	
	String h = "java,python,CH+";
	String[] h1 = h.split(",");
	System.out.println(h1[0]);
	System.out.println(h1[2]);
	System.out.println(h1[1]);
	
	String i = "Airport";
	char[] i1 = i.toCharArray();
	System.out.println(i1[3]);
	
	String j = "Fantasy Program";
	boolean j1 = j.startsWith("F");
	boolean j2 = j.endsWith("s");
	int j3 = j.length();
	System.out.println(j1+"\n"+j2+"\n" + j3);
	System.out.println(j.indexOf(""));
	
}
}

package Day_2;

public class String_2 {
	public static void main (String[]args)
	{
		String a = new String("dhivyadharshini");
		String b = a.toUpperCase();
		String b1 = a.toLowerCase();
		System.out.println(b);
		System.out.println(b1);
		
		String c = "Ashokkumar";
		String e = c.toUpperCase();
		String d = b.concat(e);
		System.out.println(d);
		
		int length = d.length();
		System.out.println(length);
		
		boolean equal = a.equals(b);
		System.out.println(equal);
		boolean ignore = a.equalsIgnoreCase(b);
		System.out.println(ignore);
		boolean start = a.startsWith("d");
		System.out.println(start);
		boolean last = a.endsWith("d");
		System.out.println(last);
		boolean ig = b.toLowerCase().startsWith("d");
		System.out.println(ig);
		boolean middle = c.contains("kk");
		System.out.println(middle);
		boolean upmiddle = c.toUpperCase().contains("KK");
		System.out.println(upmiddle);
		
		int indux = a.indexOf("h");
		System.out.println(indux);
		char at = a.charAt(11);
		System.out.println(at);
		
		String sub = a.substring(0,6);
		System.out.println(sub);
		String sub1 = a.substring(6);
		System.out.println(sub1);
		
		char[] chars = a.toCharArray();
		System.out.println(chars[9]);
		System.out.println(chars[chars.length-1]);
	
	String[] st = a.split("h");
	System.out.println(st[2]);
	System.out.println(st[st.length-1]);
	
	}

}

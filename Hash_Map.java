package collection_2;

import java.util.HashMap;

public class Hash_Map {
	public static void main (String[]args) {
		HashMap<Integer,String> details = new HashMap<>();
		details.put(17, "Ashokkumar");
		details.put(24,"DhivyaDarshini");
		details.put(11, "Barathkumar");
		details.put(19,"DeviSri");
//		System.out.println(details);
//		System.out.println("******");
//
//		System.out.println(details.keySet());
//
//		System.out.println("**************");
//
//		System.out.println(details.values());
//
//		System.out.println("*************");
//		
//		System.out.println(details.remove(11));
//		
//		System.out.println("**********");
//
//		System.out.println(details.get(24));
//		System.out.println("***********");
//
//		
//		System.out.println(details);

for(Integer a : details.keySet()) {
	System.out.println(a);
}
System.out.println("*****************");
for(String a : details.values()) {
	if(a.startsWith("D")) {
	System.out.println(a);
	}
}
System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
	for(Integer a1 : details.keySet()) {
		if(a1%2==0) {
		System.out.println(a1+" "+details.get(a1));
		}
	}
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	details.keySet().forEach(d-> {
		System.out.println(d);
	});
	details.keySet().forEach(d-> {
		System.out.println(d+" "+details.get(d));
	});

	}
  
}

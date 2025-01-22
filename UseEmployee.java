package collection_2;
import java.util.HashMap;
import java.util.Iterator;
public class UseEmployee {

	public static void main (String[]args) {
		Employee e1 = new Employee(14,"Ashokkumar",26,"Male",27000,3);
		
		Employee e2 = new Employee(24,"DhivyaDarshini",23,"Female",21000,3);
		
		Employee e3 = new Employee(11,"Barathkumar",23,"Male",25000,2);
		
		Employee e4 = new Employee(19,"DeviSri",24,"Female",47000,3);
		
		Employee e5 = new Employee(21,"Ajay",22,"Male",17000,2);
		
		
		HashMap<Integer,Employee> emps = new HashMap<>();
		emps.put(e1.getId(), e1);
		emps.put(e2.getId(), e2);
		emps.put(e3.getId(), e3);
		emps.put(e4.getId(), e4);
		emps.put(e5.getId(), e5);
		System.out.println(emps);
		
		for(Integer a : emps.keySet()) {
			System.out.println(a+" "+emps.get(a));
		}
		System.out.println("************");
		emps.keySet().forEach(d-> {
			if(emps.get(d).getAge()>25) {
				System.out.println(d+" "+emps.get(d));
			}
		});
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		for(Integer a : emps.keySet()) {
			if(emps.get(a).getSalary()>e1.getSalary()) {
				System.out.println(emps.get(a).getSalary()+" "+emps.get(a));
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
		String b = e1.getName();
		for(Integer a : emps.keySet()) {
			
			if(emps.get(a).getAge()<e2.getAge()) {
				b=emps.get(a).getName();
			}
		}
		System.out.println(b);

		
		
		System.out.println("################");

		for(Integer a : emps.keySet()) {
			if(emps.get(a).getExperience()>=3 && emps.get(a).getGender().equals("Female")) {
				System.out.println(emps.get(a).getName());
			}
		}
//		HashMap<String, Employee> gender = new HashMap<>();
//		for(Employee d : emps.values()) {
//			if(d.getGender().equals("Male")) {
//			gender.put(d.getGender(), d);	
//			System.out.println(gender);
//			}
//		}
//		for(Integer e : emps.keySet()) {
//			if(emps.get(e).getGender().equals("Female")) {
//				emps.remove(e);
//			}
//		}
		Iterator<Employee> itr = emps.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getGender().equals("Female")) {
				itr.remove(); 
			}
		}
		System.out.println(emps);
 	}
}

class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private int experience;
	public Employee(int id, String name, int age,String gender, int salary, int experience) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.experience = experience;
	}
	public String toString() {
		return id+" "+name+" "+age+" "+gender+" "+salary+" "+experience;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setSalary(int salary) {
		this.salary= salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getExperience() {
		return experience;
	}
}

package Day_1;

public class usestudent {
	public static void main(String[]args)
	{
		Student s1 = new Student();
		s1.field = "EEE";
		s1.name = "Jagan";
		s1.ismale = true;
		s1.mark1 = 89;
		s1.mark2 = 95;
		s1.mark3 = 81;
		s1.d = 3;
		s1.total = s1.mark1+s1.mark2+s1.mark3;
	    s1.Average = s1.total/3;
		
		Student s2 = new Student();
		s2.field = "ECE";
		s2.name = "Pugal";
		s2.ismale = true;
		s2.mark1 = 65;
		s2.mark2 = 48;
		s2.mark3 = 51;
		s2.total = s2.mark1+s2.mark2+s2.mark3;
		s2.Average = s2.total/3;
		
		Student s3 = new Student();
		s3.field = "CSE";
		s3.name = "Ajay";
		s3.ismale = true;
		s3.mark1 = 96;
		s3.mark2 = 98;
		s3.mark3 = 92;
		s3.total = s3.mark1+s3.mark2+s3.mark3;
		s3.Average = s3.total/3;
		
		System.out.println(s1.name+" Studied MPMC= "+s1.mark1+", CAD="+s1.mark2+", DSP="+s1.mark3);
		System.out.println("in "+s1.field+"  Department, "+s1.name+" Has Scored "+s1.total+" out of 300 and "+"The avaerage percentage of "+s1.name+" is "+s1.Average+" %");
		
		System.out.println(s2.name+" Studied OOPS= "+s2.mark1+", DSA="+s2.mark2+", DSC="+s2.mark3);
		System.out.println("in "+s2.field+"  Department "+s2.name+" Has Scored "+s2.total+" out of 300 and "+"The avaerage percentage of "+s2.name+" is "+s2.Average+" %");
		
		System.out.println(s3.name+" Studied linux= "+s3.mark1+", Python="+s3.mark2+", JAVA="+s3.mark3);
		System.out.println("in "+s3.field+" Department "+s3.name+" Has Scored "+s3.total+" out of 300 and "+"The avaerage percentage of "+s3.name+" is "+s3.Average+" %");
	}

}

import java.util.Scanner;

public class Student {
	
	private int rollNo;
	private String stdName;
	private String mobile;
	private String clgName;
	private int sub1,sub2,sub3;
	
	public void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll No = ");
		rollNo = sc.nextInt();
		System.out.println("Enter Name = ");
		stdName = sc.next();
		System.out.println("Enter mobile = ");
		mobile = sc.next();
		System.out.println("Enter college Name = ");
		clgName = sc.next();
		System.out.println("Enter sub 1 = ");
		sub1 = sc.nextInt();
		System.out.println("Enter sub 2 = ");
		sub2 = sc.nextInt();
		System.out.println("Enter sub 3 = ");
		sub3 = sc.nextInt();
		sc.close();
	}
	
	private float getPercentage()
	{
		float per = (sub1+sub2+sub3)/3;
		return per;
	}
	
	private char calculateGrade()
	{
	     float percentage = getPercentage(); 
	     
	     if(percentage>=75)
	    	 return 'A';
	     else
	    	 if(percentage<75 || percentage>=60)
	    		 return 'B';
	    	 else
	    		 if(percentage<60 || percentage>=45)
	    			 return 'D';
	    		 else
	    			 return 'F';
	}
	
	public void printMarksSheet()
	{
		System.out.println("******************Marks Sheet ******************");
		System.out.println("Roll Number :"+rollNo);
		System.out.println("Name :"+stdName);
		System.out.println("Mobile Number :"+mobile);
		System.out.println("College name :"+clgName);
		System.out.println("************************************************");
		System.out.println("Subject 1 :"+sub1);
		System.out.println("Subject 2 :"+sub2);
		System.out.println("Subject 3 :"+sub3);
		System.out.println("************************************************");
		System.out.println("Total Obtain marks"+(sub1+sub2+sub3));
		System.out.println("Total marks :"+300);
		System.out.println("************************************************");
		System.out.println("Percentage :"+getPercentage());
		System.out.println("Grade :"+calculateGrade());
		System.out.println("************************************************");
	}
}//student
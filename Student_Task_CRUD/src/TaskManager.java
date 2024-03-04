
import java.util.*;

public class TaskManager {
	Scanner sc=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	static List<Student> c=new ArrayList<Student>(); 
	void newtask()
	{ System.out.println();
		System.out.println("   New Task    ");
		System.out.print("Enter Roll No : ");
		int rollno=sc.nextInt();
		System.out.print("Enter Stu Name : ");
		String sname=sc2.nextLine();
		System.out.print("Enter Branch : ");
		String branch=sc2.nextLine();
		System.out.print("Enter CTC : ");
		int ctc=sc.nextInt();
		
		c.add(new Student(rollno, sname, branch, ctc));
		System.out.println("New Record is created Sucessfully...!");
		System.out.println();
		
	}
	void readtask()
	{
		System.out.println();
		System.out.println("   Read Task   ");
//		System.out.println(c);
		System.out.println("--------------------------");
		Iterator<Student> i=c.iterator();
		while(i.hasNext())
		{
			Student s=i.next();
			System.out.println(s);
		}
		System.out.println("--------------------------");
		System.out.println();
		
	}
	void deletetask()
	{
		System.out.println();
	    System.out.println("   Delete Task    ");	
	    boolean found=false;
		System.out.print("Enter RollNo. to Delete : ");
		int rollno=sc.nextInt();
		System.out.println("--------------------------");
		Iterator<Student> i=c.iterator();
		while(i.hasNext())
		{
			Student s=i.next();
			if(s.getRollno()==rollno)
			{
				System.out.println(s);
				i.remove();
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("Record Not Found");
		}
		else {
			System.out.println("Record Delete Sucessfully...!!");
		}
		System.out.println("--------------------------");
		System.out.println();
	}
	void updatetask()
	{
		System.out.println();
		System.out.println("   Update Task    ");
	        boolean found=false;
			System.out.print("Enter RollNo. to Update : ");
			int rollno=sc.nextInt();
			System.out.println("--------------------------");
			ListIterator<Student> li=c.listIterator();
			
			while(li.hasNext())
			{
				Student s=li.next();
				if(s.getRollno()==rollno) 
				{
					System.out.println(s);
					System.out.println("Enter new Name : ");
					String sname=sc2.nextLine();
					System.out.println("Enter new Branch : ");
					String branch=sc2.nextLine();
					System.out.println("Enter new CTC : ");
					int ctc=sc.nextInt();
					li.set(new Student(rollno, sname, branch, ctc));
					found=true;
				}
			}
			if(!found)
			{
				System.out.println("Record Not Found");
			}
			else {
				System.out.println("Record Update  Sucessfully...!!");
			}
			System.out.println("--------------------------");
			System.out.println();
	}
	void searchtask()
	{ 	System.out.println();
		System.out.println("   Search Task   ");
		boolean found=false;
		System.out.print("Enter RollNo. to Search : ");
		int rollno=sc.nextInt();
		System.out.println("--------------------------");
		Iterator<Student> i=c.iterator();
		while(i.hasNext())
		{
			Student s=i.next();
			if(s.getRollno()==rollno)
			{
				System.out.println(s);
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("Record Not Found");
		}
		System.out.println("--------------------------");
		System.out.println();
	}

}

import java.util.Scanner;

public class TaskCaller {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int choice;
		try {
			
			do {
				TaskManager obj=new TaskManager();
				System.out.println("1.Enter a New Task");
				System.out.println("2.Read Task");
				System.out.println("3.Search Task");
				System.out.println("4.Delete Task");
				System.out.println("5.Update Task");
				System.out.print("Enter Your Choice : ");
				choice=sc.nextInt();

				
				switch (choice) {
				case 1:
					obj.newtask();
					break;
				case 2:
					obj.readtask();
					break;
				case 3:
					obj.searchtask();
					break;
				case 4:
					obj.deletetask();
					break;
				case 5:
					obj.updatetask();
					break;
					

				default:
					System.out.println("Invalid Choice");
					break;
				
				}
			
				
			} while (choice!=0);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}	}

}


import java.util.Scanner;

public class LoginPage {

	public LoginPage() 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("3.LogOut");
		System.out.println("Enter Your Choice: ");
		int ch=scanner.nextInt();
		
		do {
		
	
		switch (ch)
		{
		case 1:
			System.out.println("1.Login");
			GetLogin l=new GetLogin();
			l.doLogin();
			
			
			break;
		case 2:
			System.out.println("2.Register");
			GetLogin li=new GetLogin();
			li.doRegister();
			break;
		case 3:
			System.out.println("3.LogOut");
			break;

		default:
			System.out.println("Wrong Option...!!!!");
			break;
		}
			} while (ch==0);
	}
		
	
	public static void main(String[] args) {
		LoginPage lo=new LoginPage();
	
	}
	
}

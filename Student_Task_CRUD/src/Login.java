
import java.util.Date;
import java.util.Scanner;

//POJO - Plain Old Java Object

class Message {
    private String msg;
    private Date date;
    private String email;
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class User {
    private String name;
    private String gender;
    private String email;
    private String password;
    private int phone;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}

class GetLogin{
    Scanner scanner = new Scanner(System.in);
    void doLogin() {
        
        System.out.println("Enter your email : ");
        String email = scanner.nextLine();
        
        System.out.println("Enter your password : ");
        String password = scanner.nextLine();
        
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        
        DB db = new DB();
        Message msg = db.validateUser(user);
        System.out.println(msg.getDate());
        System.out.println(msg.getMsg());
        System.out.println(msg.getEmail());
        if(msg.getMsg().equals("Login Success..."))
        {
        	 TaskCaller taskCaller=new TaskCaller();
             taskCaller.main(null);
        	
        }
        
    }
    
    void doRegister() {
        
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your email : ");
        String email = scanner.nextLine();
        
        System.out.println("Enter your password : ");
        String password = scanner.nextLine();
        
        System.out.println("Enter your gender : ");
        String gender = scanner.nextLine();
        
        System.out.println("Enter your phone : ");
        int phone = scanner.nextInt();
        
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setGender(gender);
        user.setPhone(phone);
        
        DB db = new DB();
        db.registerUser(user);
        
    }
}

class DB {
//    String validateUser(String email, String password) {
//        String msg;
//        Date date = new Date();
//        if(email.equals("ram@gmail.com") && password.equals("1234")) {
//            msg = "Login Success...";
//        }
//        else {
//            msg = "Login Failed...";
//        }
//        //System.out.println("Last Login : " + date);
//        //return msg + date + email;
//        return msg;
//    }
    
    Message validateUser(User user) {
        String loginMsg;
        if(user.getEmail().equals("sambhawi@gmail.com") && user.getPassword().equals("1234")) {
            loginMsg = "Login Success...";
           
            
        }
        else {
            loginMsg = "Login Failed...";
        }
        
        Message msg = new Message();
        msg.setDate(new Date());
        msg.setEmail(user.getEmail());
        msg.setMsg(loginMsg);
        
        return msg;
        
    }
    
    void registerUser(User user) {
    	System.out.println("\n"+"\t"+"Registration Succesful...!!!!");
    	System.out.println("User Details are: ");
    	System.out.println("Name: "+user.getName());
    	System.out.println("Email ID: "+user.getEmail());
    	System.out.println("Phone No: "+user.getPhone());
    	System.out.println("Gender: "+user.getGender());
    	System.out.println("Password: "+user.getPassword());
        
    }
}

public class Login {

    public static void main(String[] args) {
        
       GetLogin user = new GetLogin();
        user.doLogin();

    }

}
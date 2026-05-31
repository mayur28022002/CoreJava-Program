package ExceptionHandling;

public class Demo {
 public static void main(String[] args) {
	String username="admin";
	String password="1234";
	try {
		if(!password.equals("admin123")) {
			throw new Exception("Invalid Password");
		}
		System.out.println("Login Successfull");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}

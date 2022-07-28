

import java.awt.Checkbox;
import java.net.Socket;
import java.util.Scanner;

public class LoginProjrect {
	public static void main(String[] args) {
		String username,password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username:");
		username = scanner.nextLine();
		System.out.println("Enter your password:");
		password=scanner.nextLine();
		
		boolean login = true;
		String loginUserName,loginPassword;
		while(login) {
			boolean CheckValid =false;
			System.out.println("Username:");
			loginUserName= scanner.nextLine();
			System.out.println("Password:");
			loginPassword=scanner.nextLine();
			if(loginUserName.equals(username)&& (loginPassword.equals(password))) {
				CheckValid=true;
				login=false;
				System.out.println("You have successifull loged in");
			}else {
				CheckValid=false;
				System.out.println("Incorrect username or password");
			}
		}
		
	}

}

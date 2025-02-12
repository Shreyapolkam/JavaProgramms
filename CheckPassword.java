package come.codegnan.example;

import java.util.Scanner;

interface passwordchecker{
	public  abstract String checkpasswordlength(String password);
	public  abstract String checkcomplexcity(String password);
	
	
}


class simplepasswordchecker implements  passwordchecker{

	@Override
	public String checkpasswordlength(String password) {
		
		return ("Length :"  + password.length());
	}

	@Override
	public String checkcomplexcity(String password) {
		if(password.length()<8) {
			return "weak";
			
		}else if(password.length()==8) {
			return " medium";
		} else {
			return "Strong";
			
			
		}
	
	}
	
}

public class CheckPassword {
	public static void main (String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the password");
		  String password = scanner.nextLine(); 
		simplepasswordchecker check = new simplepasswordchecker();
		System.out.println(check.checkpasswordlength(password));
		System.out.println(check.checkcomplexcity(password));
		
		
	}
}

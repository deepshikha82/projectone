
import java.util.Scanner;

public class MethodInstance {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	Name  nameObject = new Name();
	
	System.out.println("Enter name of girl here");
	
	String temp = input.nextLine();
	
	nameObject.setName(temp);
	
	nameObject.saying();
	
	
	

	}

}


class Name{
	
	private String girlName;
	
	public void setName(String name) {
		
		girlName = name;
		
	}	
		
	public String getName() {
		
		return girlName;
			
		
		
	}
	
	public void saying() {
		
		System.out.printf("Your first girl name %s",  getName());
	}

	
}
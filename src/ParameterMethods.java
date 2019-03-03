
import java.util.Scanner;

public class ParameterMethods {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Method methodObject = new Method();
		
	System.out.println("Enter your name here");
		
		String name = input.nextLine();
		
		methodObject.SimpleMessage(name);
		
		
		
	}

}

class Method{
	
	public void SimpleMessage (String name ) {
		
		System.out.println("Hello "+ name);
	}
	
}
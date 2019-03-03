package testvari;

public class Testdatatypes {
	
	int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		
		Testdatatypes obj = new Testdatatypes();
		
		int a =10;
		int b =10;
		int c;
		c = obj.add(a,b);
		
		System.out.println(c);
		
}
}
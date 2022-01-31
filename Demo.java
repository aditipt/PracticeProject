package pack1;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program Started");
		
		System.out.println("-------Implicit Type Casting-------");
		
		int i = 100;
		System.out.println("i = " + i);
		double d =i;
		System.out.println("d = " + d);
		
		System.out.println("-----------------");

		char c = 'A';
		System.out.println("c = " + c);
		int a = c;
		System.out.println("a = " + a);
		
		System.out.println("-------Explicit Type Casting-------");
		
		double d1 = 88.88;
		System.out.println("d1 = " + d1);
		int i1 = (int)d1;
		System.out.println("i1 = " + i1);
		
		System.out.println("-----------------"); 
		
	    int i2 = 65;
	    System.out.println("i2 = " + i2);
	    char c1 = (char)i2;
	    System.out.println("c1 = " + c1);
		System.out.println("Program Ended");
	}

}

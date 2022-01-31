package pack1;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		
		System.out.println("Arithematic Calculator");
		
		Scanner sc1 = new Scanner(System.in);
		int a;
		int b;
		int c;
		int val;
		System.out.println("Enter no :");
		a = sc1.nextInt();
		System.out.println("Enter no :");
		b = sc1.nextInt();
		System.out.println("Enter the value : ");
		val = sc1.nextInt();
		if(val==1) {
	    System.out.println("*****Addition***** ");
	    c = a + b;
	    System.out.println("Addition is :" + c);
	    }
		else if(val==2) {
	    System.out.println("*****Substraction***** ");
	    c = a - b;
	    System.out.println("Substraction is :" + c);
	    }
		else if(val==3) {
	    System.out.println("*****Multiplication***** ");
	    c = a * b;
	    System.out.println("Multiplication is :" + c);
	    }
		else if(val==4) {
	    System.out.println("*****Division***** ");
	    c = a / b;
	    System.out.println("Division is :" + c);
	    }
		else {
			
			System.out.println("Enter the correct value!!");
		}
	    sc1.close();
	}

}

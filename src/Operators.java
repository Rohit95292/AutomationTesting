import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
			
			
		// TODO Auto-generated method stub
		 int a= 10;
		 	int b= 20;
		 	
		 
		 	
		 	// Arithmetic operators
		 	System.out.println ("--------------------------Arithmetic Operators--------------------------");
		 	System.out.println("Sum of a and b is: " + (a+b) );
		 	System.out.println("Substraction of a and b is: " + (a-b) );
		 	System.out.println("multiplication of a and b is: " + (a*b) );
		 	System.out.println("Division of a and b is: " + (a/b) );
	
		 	//Relational operators (Comparison)
		 	System.out.println ("--------------------------Comparison Operators--------------------------");
		 	System.out.println("a is equal to b: " + (a==b) ); //false
		 	System.out.println("a is smaller than or equal to b: " + (a<=b) );
		 	System.out.println("a is greater than or equal to b: " + (a>=b) );
		 	System.out.println("a is smaller than to b: " + (a<b) );
		 	
		 	//Logical Operators && ||  |

		 	boolean x = true;
		 	boolean y = false;
		 	boolean z= true;
		 	boolean w= false;
		 	System.out.println ("--------------------------Logical Operators--------------------------");
		 	System.out.println (x && y); //false
		 	System.out.println (x && z); // true
		 	
		 	System.out.println (x || y);  //true
		 	System.out.println (w || y); //false
		 	System.out.println (x || z);  //True
		 	
		 	System.out.println (!y);  //true
		 	System.out.println (!x); //false
		 	
		 	System.out.println ("--------------------------Increamental Operators--------------------------");
		 	
		 	int f=10;
		 	f= (f+1);   //f++;
		 	System.out.println (f);
	}}

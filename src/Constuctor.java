
public class Constuctor {
	
	Constuctor () {
		System.out.println ("default constructor"); 
	}
	Constuctor (int a) {
		System.out.println ("Single constructor"); 
	}
	Constuctor (int a, int b) {
		System.out.println ("Double constructor"); 
	}
	Constuctor (int a, int b, int c) {
		System.out.println ("Triple constructor"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constuctor m=new Constuctor();
		Constuctor m1=new Constuctor(5);
		Constuctor m2=new Constuctor(5,10);
		Constuctor m3=new Constuctor(5,10,15);
		
	}

}

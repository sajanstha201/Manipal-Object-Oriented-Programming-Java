package Inheritance;

public class different_access_modifier_in_subclass {
	public static void main(String args[]) {
		Cxxx c = new Cxxx();
		c.add();
	}

}

class Bxxx {
	Bxxx() {
		System.out.println("THis si sform class B");
	}

	void add() {
		System.out.println("This is from class B add method");
	}
}

class Cxxx extends Bxxx {
	Cxxx() {
		System.out.println("THis is from class C");
	}

	// protected void add() {//it will created some warning
	// System.out.println("THis is from class C add method");
////	}
	public void add() {
		System.out.println("This is from class C add method");
	}
}
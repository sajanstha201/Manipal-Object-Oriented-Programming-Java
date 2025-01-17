package Inheritance;

public class abstractx {
	public static void main(String[] args) {
		// AB ab=new AB();
		AB cd = new CD();
		cd.add3();
		// cd.extra();
		CD cd2 = new CD();
		cd2.add3();
	}
}

abstract class AB {
	AB() {
		System.out.println("This is from class AB");
	}

	int a;
	final int f = 9;
	static int b = 10;
	public int c;
	private int d;

	// abstract int e;
	void add() {
		System.out.println("This is from class AB add method");
	}

	abstract void sub();

//	abstract void sub() {
	// System.out.println("This is from class AB sub method");
//	}
	static void add2() {
		System.out.println("This is from class AB add2 method");
	}

	final void add3() {
		System.out.println("This is from class AB add3 method");
	}
}

class CD extends AB {
	CD() {
		System.out.println("This is from class CD");
	}

	void add() {// this is overidden
		System.out.println("This is from calss CD add method");
	}

	void sub() {// this is overidden
		System.out.println("This is from class CD sub method");
	}

	static void add2() {// this is not overidden but method hiding
		System.out.println("This is from class CD add2 method");
	}

	void extra() {
		System.out.println("This is from class CD extra method");
	}
}

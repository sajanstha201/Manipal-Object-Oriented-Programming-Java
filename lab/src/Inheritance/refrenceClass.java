package Inheritance;

public class refrenceClass {
	public static void main(String[] args) {
		Bxx b = new Bxx();
		b.add();
		System.out.println(b.a);
	}
}

class Axx {
	int a = 9;

	Axx() {
		System.out.println("This is from class A");
	}

	void add() {
		System.out.println("This is from class A add method");
	}
}

class Bxx extends Axx {
	int a = 5;

	Bxx() {
		System.out.println("This is from class B");
	}

	void sub() {
		System.out.println("This is from class B sub method");
	}
}
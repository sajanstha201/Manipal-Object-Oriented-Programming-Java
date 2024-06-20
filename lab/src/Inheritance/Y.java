package Inheritance;

import superclass.B;

public class Y {
	Y() {
		System.out.println("This is from class Y inheritance package");
	}

	public static void main(String[] args) {
		Y y = new Y();
		B x = new B();
		x.add();
	}
}

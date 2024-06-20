package Inheritance;

public class abstract0 {
	public static void main(String[] args) {
		C c = new C();
		A a = new A();
	}
}

interface D {
	// static int a;
	abstract void add();

	static void sub() {
		System.out.println("This is form class D");
		// D.G g=new G();
	}

	class G {
		G() {
			System.out.println("This is from class G");
		}

		void add() {
			System.out.println("This is from class G add method");
		}
	}
}

class A implements D {
	A() {
		System.out.println("This is form class A");
		add();
		G g = new G();
	}

	public void add() {
		System.out.println("This is from class A add method");
	}
}

abstract class B {
	int a = 10;

	B() {
		System.out.println("This is from class B");
	}

	static void adder() {
		System.out.println("this is from class B adder method");
	}

	abstract public void add();// {
	// System.out.println("This is from class B add method");
	// }

	void ad() {
		System.out.println("This is from class B method add ");
	}

	abstract static class E {
		E() {
			System.out.println("This is from class E");
		}

		abstract void add();
	}

	static class F extends E {
		F() {
			System.out.println("This is from class F");
		}

		void add() {
			System.out.println("This is from class F add method");
		}
	}

	abstract static class S {
		S() {
			System.out.println("This is from class S");
		}
	}
}

class C extends B {
	abstract static class S {
		S() {
			System.out.println("THis isfrom class S outerclass C");
		}
	}

	C() {
		System.out.println("This is from class C" + a);
		F fh = new F();
	}

	public void add() {
		System.out.println("This is from class C add method.");
	}

	static void sub() {
		System.out.println("This is from class C sub static method");
	}

	static class Z extends E {
		Z() {
			System.out.println("This is from subclass Z of superclass X");
		}

		void add() {
			System.out.println("This is from class Z add method");
		}
	}

}

class X {
	X() {
		System.out.println("This is from class X");
	}

	static void add() {
		System.out.println("This is from class X add method");
	}

}

class Y extends X {
	Y() {
		System.out.println("This  is from  class Y");
	}

	static void add() {
		System.out.println("This is from class Y add method");
	}
}
